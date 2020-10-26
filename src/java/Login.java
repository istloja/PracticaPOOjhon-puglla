
import java.awt.event.ActionEvent;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Named;
import javax.servlet.http.HttpSession;
import org.primefaces.context.RequestContext;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USUARIO // Sirven para comunicarme con el xhtml
 */
@Named(value="Login")
@RequestScoped // me sirve para comunicarme con el navegador mientras este abierto
public class Login  {
    private String nombre;
  private String clave;
  private boolean logeado = false;

  public boolean estaLogeado() {
    return logeado;
  }

  public String getNombre() {
    return nombre;
  }

  public void setNombre(String nombre) {
    this.nombre = nombre;
  }

  public String getClave() {
    return clave;
  }

  public void setClave(String clave) {
    this.clave = clave;
  }
  public void login(ActionEvent actionEvent) {
    RequestContext context = RequestContext.getCurrentInstance();
    FacesMessage msg = null;
    if (nombre != null && nombre.equals("admin") && clave != null
        && clave.equals("admin")) {
      logeado = true;
      msg = new FacesMessage(FacesMessage.SEVERITY_INFO, "Bienvenid@", nombre);
    } else {
      logeado = false;
      msg = new FacesMessage(FacesMessage.SEVERITY_WARN, "Login Error",
                             "Credenciales no válidas");
    }

    FacesContext.getCurrentInstance().addMessage(null, msg);
    context.addCallbackParam("estaLogeado", logeado);
    if (logeado)
      context.addCallbackParam("view", "gauge.xhtml");
  }

  public void logout() {
    HttpSession session = (HttpSession) FacesContext.getCurrentInstance() 
                                        .getExternalContext().getSession(false);
    session.invalidate();
    logeado = false;
  }
}


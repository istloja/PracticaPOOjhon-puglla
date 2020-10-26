/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicios;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import modelo.Clientes;

/**
 *
 * @author USUARIO
 */
@Stateless
@Path("modelo.clientes")
public class ClientesFacadeREST extends AbstractFacade<Clientes> {

    @PersistenceContext(unitName = "proyecto_joyeriaPU")
    private EntityManager em;

    public ClientesFacadeREST() {
        super(Clientes.class);
    }

    @POST
    @Override
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void create(Clientes entity) {
        super.create(entity);
    }
//Registrar un cliente ..
    @POST
    @Path("Clientes")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_JSON})
    public String CrearCliente(@FormParam("idclientes") Integer idclientes, @FormParam("nombre") String nombre,
            @FormParam("direccion") String direccion,
            @FormParam("correo") String correo, @FormParam("telefono") Integer telefono, @FormParam("ciudad") String ciudad,
            @FormParam("edad") Integer edad, @FormParam("joyeria_prefrencia") Integer joyeria_prefrencia) {

        Clientes cli = new Clientes(
                idclientes,
                nombre,
                direccion,
                correo,
                telefono,
                ciudad,
                edad,
               joyeria_prefrencia);
        super.create(cli);
        return "El cliente ha sido registrado";
    }
    //Buscar mediante el Id al cliente..
    @POST
    @Path("Busqueda")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_JSON})
    public List<Clientes> leer(@FormParam("idclientes") Integer idclientes) {
        TypedQuery busqueda = getEntityManager().createQuery("SELECT c FROM Clientes c WHERE c.idclientes = :idclientes",Clientes.class);
        busqueda.setParameter("idclientes", idclientes);
        return busqueda.getResultList();
    }
    //Elimninar los datos del cliente mediante su ID..
    @POST
    @Path("Eliminar")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_JSON})
    public String eliminar(@FormParam("idclientes") Integer idclientes) {
        Clientes cliente=super.find(idclientes);
        super.remove(cliente);
        return "El cliente ha sido eliminado con exito";
        
    }
    //Update actualizar los datos del cliente..
    @POST
    @Path("Update")
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_JSON})
    public String update (@FormParam("idclientes") Integer idclientes, @FormParam("nombre") String nombre,
            @FormParam("direccion") String direccion,
            @FormParam("correo") String correo, @FormParam("telefono") Integer telefono, @FormParam("ciudad") String ciudad,
            @FormParam("edad") Integer edad, @FormParam("joyeria_prefrencia") Integer joyeria_prefrencia) {
        Clientes cliente=super.find(idclientes);
        cliente.setNombre(nombre);
        cliente.setDireccion(direccion);
        cliente.setCorreo(correo);
        cliente.setTelefono(telefono);
        cliente.setCiudad(ciudad);
        cliente.setEdad(edad);
        cliente.setJoyeriaPrefrencia(joyeria_prefrencia);
        super.edit(cliente);
        return "El cliente ha sido actualizado con exito";
         }
    //Consultar mayor edad a clientes..
    @POST
    @Path("ConsultaMayor")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_XML})
    public List<Clientes> mayor(@FormParam("edad") Integer edad) {
        TypedQuery consultar= getEntityManager().createQuery("SELECT c FROM Clientes c WHERE c.edad = :edad",Clientes.class);
        consultar.setParameter("edad", edad);
        return consultar.getResultList();
    }
    //consultar ciudades...
    @POST
    @Path("ConsultaCiudades")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_XML})
    public List<Clientes> ciudad(@FormParam("ciudad") String ciudad) {
        TypedQuery consultaciudad= getEntityManager().createQuery("SELECT c FROM Clientes c WHERE c.ciudad = :ciudad",Clientes.class);
        consultaciudad.setParameter("ciudad", ciudad);
        return consultaciudad.getResultList();
    }
    @PUT
    @Path("{id}")
    @Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public void edit(@PathParam("id") Integer id, Clientes entity) {
        super.edit(entity);
    }

    @DELETE
    @Path("{id}")
    public void remove(@PathParam("id") Integer id) {
        super.remove(super.find(id));
    }

    @GET
    @Path("{id}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public Clientes find(@PathParam("id") Integer id) {
        return super.find(id);
    }

    @GET
    @Override
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Clientes> findAll() {
        return super.findAll();
    }

    @GET
    @Path("{from}/{to}")
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
    public List<Clientes> findRange(@PathParam("from") Integer from, @PathParam("to") Integer to) {
        return super.findRange(new int[]{from, to});
    }

    @GET
    @Path("count")
    @Produces(MediaType.TEXT_PLAIN)
    public String countREST() {
        return String.valueOf(super.count());
    }

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

}

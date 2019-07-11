/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolgeneologico;

/**
 *
 * @author Usuario
 */
public class hijo extends persona {

    madre madre;
    padre padre;

    public hijo() {
        setNombre(" johnn ");
        setApellido(" puglla velez ");
        setEdad(20);
    }

    public madre getMadre() {
        return madre;
    }

    public void setMadre(madre madre) {
        this.madre = madre;
    }

    public padre getPadre() {
        return padre;
    }

    public void setPadre(padre padre) {
        this.padre = padre;
    }

}



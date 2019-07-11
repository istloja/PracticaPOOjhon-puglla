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
public class madre extends persona {

    hijo hijo;
    padre esposo;

    public madre() {
        setNombre("mariana");
        setApellido("velez");
        setEdad(38);

    }

    public hijo getHijo() {
        return hijo;
    }

    public void setHijo(hijo hijo) {
        this.hijo = hijo;
    }

    public padre getEsposo() {
        return esposo;
    }

    public void setEsposo(padre esposo) {
        this.esposo = esposo;
    }

}

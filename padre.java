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
public class padre  extends persona{
     hijo hijo;
    madre esposa;
    public padre(){
        setNombre("angel");
        setApellido("puglla");
        setEdad(40);
    }

    public hijo getHijo() {
        return hijo;
    }

    public void setHijo(hijo hijo) {
        this.hijo = hijo;
    }

    public madre getEsposa() {
        return esposa;
    }

    public void setEsposa(madre esposa) {
        this.esposa = esposa;
    }

    
}

    


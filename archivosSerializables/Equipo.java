/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosSerializables;

import java.io.Serializable;

/**
 *
 * @author ISTLOJJA
 */
public class Equipo implements Serializable {
    private String Nombre;
    private int numero_titulos;
    private String Ciudad;

    public Equipo() {
    }

    public Equipo(String Nombre, int numero_titulos, String Ciudad) {
        this.Nombre = Nombre;
        this.numero_titulos = numero_titulos;
        this.Ciudad = Ciudad;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getNumero_titulos() {
        return numero_titulos;
    }

    public void setNumero_titulos(int numero_titulos) {
        this.numero_titulos = numero_titulos;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }
    
}

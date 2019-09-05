/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria_Archivos_serializables;

import java.io.Serializable;

/**
 *
 * @author ISTLOJJA
 */
public class Autor implements Serializable{
  private  String nombre;
  private int edad;
  private String Apellido;
  private String sexo;
  private String pais_donde_vive;

    public Autor() {
    }

    public Autor(String nombre, int edad, String Apellido, String sexo, String pais_donde_vive) {
        this.nombre = nombre;
        this.edad = edad;
        this.Apellido = Apellido;
        this.sexo = sexo;
        this.pais_donde_vive = pais_donde_vive;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getPais_donde_vive() {
        return pais_donde_vive;
    }

    public void setPais_donde_vive(String pais_donde_vive) {
        this.pais_donde_vive = pais_donde_vive;
    }
  
   
}

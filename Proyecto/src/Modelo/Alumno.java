/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author ISTLOJA_05
 */
public class Alumno {
    
    private String nombres, apellidos,Ciudadania,Sexo,Telefono,Direccion,Correo;
    private String Numero_de_ID; 

    public Alumno() {
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCiudadania() {
        return Ciudadania;
    }

    public void setCiudadania(String Ciudadania) {
        this.Ciudadania = Ciudadania;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String Telefono) {
        this.Telefono = Telefono;
    }

    public String getDireccion() {
        return Direccion;
    }

    public void setDireccion(String Direccion) {
        this.Direccion = Direccion;
    }

    public String getCorreo() {
        return Correo;
    }

    public void setCorreo(String Correo) {
        this.Correo = Correo;
    }

    public String getNumero_de_ID() {
        return Numero_de_ID;
    }

    public void setNumero_de_ID(String Numero_de_ID) {
        this.Numero_de_ID = Numero_de_ID;
    }
    
}

   
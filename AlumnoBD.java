/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.ArrayList;

/**
 *
 * @author ISTLOJA_05
 */
public class AlumnoBD {

    public static void guardarAlumnoBD(Alumno alumno) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/Formulario", "root", "root");
            System.out.println("Conexion establecida!");
            Statement sentencia = (Statement) conexion.createStatement();
            int insert = sentencia.executeUpdate("insert into estudiante values('"
                    + alumno.getNombres()
                    + "','" + alumno.getApellidos()
                    + "','" + alumno.getNumero_De_Id()
                    + "','" + alumno.getCiudadania()
                    + "','" + alumno.getSexo()
                    + "','" + alumno.getTelefono()
                    + "','" + alumno.getDireccion()
                    + "','" + alumno.getCorreo()
                    + "')");

            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.println("Error en la conexion" + ex);
        }

    }

    public static void eliminar(String Numero_de_Id) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/Formulario", "root", "root");
            System.out.print("Conexion Establecida");
            Statement sentencia = conexion.createStatement();
            int insert = sentencia.executeUpdate("delete from estudiante where Numero_de_Id = '" + Numero_de_Id + "'");

            sentencia.close();
            conexion.close();
        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }
    }

    public static ArrayList cargar() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection conexion = DriverManager.getConnection("jdbc:mysql://localhost/Formulario", "root", "root");
            System.out.print("Conexion establecida!");
            Statement sentencia = conexion.createStatement();
            ResultSet necesario = sentencia.executeQuery("select * from estudiante");
            Alumno alumno;
            ArrayList<Object> lista= new ArrayList<>();
            while (necesario.next()) {
                String Nomb = necesario.getString("Nombres");
                String Ape = necesario.getString("Apellidos");
                String Num_Id = necesario.getString("Numero_de_Id");
                String Ciudadania = necesario.getString("Ciudadania");
                String Sex = necesario.getString("Sexo");
                String tel = necesario.getString("Telefono");
                String Direcc = necesario.getString("Direccion");
                String Corre = necesario.getString("Correo");
                alumno = new Alumno();
                alumno.setNombres(Nomb);
                alumno.setApellidos(Ape);
                alumno.setNumero_De_Id(Num_Id);
                alumno.setSexo(Sex);
                alumno.setTelefono(tel);
                alumno.setDireccion(Direcc);
                alumno.setCorreo(Corre);

                lista.add(alumno);
            }
            sentencia.close();
            conexion.close();

        } catch (Exception ex) {
            System.out.print("Error en la conexion" + ex);
        }
        return null;

    }
}

    public static Object buscar(String cedula) {
        ListasEstudiantesBD r = new ListasEstudiantesBD();
        listaE = new ArrayList<>();
        listaE = r.cargar();
        for (int i = 0; i < listaE.size(); i++) {
            Alumno con = (Alumno) listaE.get(i);
            if (con.getNumero_De_Id().equals(cedula)) {
               return con;
            }
        }
        return null;
    }
}

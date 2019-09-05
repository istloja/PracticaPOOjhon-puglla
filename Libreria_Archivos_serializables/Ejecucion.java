/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Libreria_Archivos_serializables;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ISTLOJJA
 */
public class Ejecucion {
       public void escribirObjeto(String Direccion, Libro libro) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(Direccion));
            escritor.writeObject(libro);
            escritor.close();
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
    }

    public void escribirLista(String Direccion, List<Libro> LI) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(Direccion));
            for (Libro libro : LI) {//para crear una lista
                escritor.writeObject(libro);
            }
            escritor.close();
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
    }

    public void leerArchivo(String Direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(Direccion));
            Object auxiliar = lector.readObject();
            Libro libro = (Libro) auxiliar;//cambio de objeto a persona
            System.out.println(libro.getAutor().getNombre()+"su ciudad  es "+ libro.getAutor().getPais_donde_vive());
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
    }

    public List<Libro> LeerLibro(String dire) {
        List<Libro> lista = new ArrayList<>();
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(dire));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Libro l1 = (Libro) auxiliar;
                lista.add(l1);
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
        return lista;
    }

    public static void main(String[] args) {
        
        Ejecucion objeto = new Ejecucion();
        
        Libro l1 = new Libro(33, "Cientifico", "el viaje del veable", 2001,new Autor("·Charles Darwin",21,"ROMAUS","Masculino","francia"));
        Libro l2 = new Libro(25, "literarios", "pedro paramo ", 1990, new Autor("·Robert ",61,"tua","Masculino","peru"));
        Libro l3 = new Libro(39, "culturales", "padre rico padre pobre", 1999, new Autor("·jahmy",21,"ROM","femenino","francia"));
        Libro l4 = new Libro(40, "de viaje", "el arte en la guerra", 2005, new Autor("·toku",21,"mkis","femenino","inglaterra"));;
        Libro l5 = new Libro(46, "Ciencia pura", "el arte emocional", 2008, new Autor("·maria",21,"mau","femenino","colombia"));
        
        List<Libro> Lista = new ArrayList<>();
        
        Lista.add(l1);
        Lista.add(l2);
        Lista.add(l3);
        Lista.add(l4);
        Lista.add(l5);
        int a =Lista.size();
        
        objeto.escribirObjeto("C:\\Users\\ISTLOJJA\\Desktop\\libreria.txt", l5);
        objeto.escribirLista("C:\\Users\\ISTLOJJA\\Desktop\\libreria.txt", Lista);
        objeto.leerArchivo("C:\\Users\\ISTLOJJA\\Desktop\\libreria.txt");
        objeto.LeerLibro("C:\\Users\\ISTLOJJA\\Desktop\\libreria.txt");
        List<Libro> LI = objeto.LeerLibro("C:\\Users\\ISTLOJJA\\Desktop\\libreria.txt");
    }

}


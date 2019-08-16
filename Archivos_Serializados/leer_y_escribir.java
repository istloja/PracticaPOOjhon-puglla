/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos_Serializados;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ISTLOJAV
 */
public class leer_y_escribir {

    public void escribirObjeto(String direccion, Persona objeto) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            escritor.writeObject(objeto);
            escritor.close();
        } catch (Exception e) {
            System.out.println(" se produjo un error " + e);
        }
    }

    public void leerArchivo(String direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            Persona objeto = (Persona) auxiliar;
            System.out.println(objeto.getMascota().getNombre() + " su edad es es: " + objeto.getEdad());
        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void EscribirLista(String direccion, List<Persona> lista) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Persona persona : lista) {
                escritor.writeObject(persona);

            }
            escritor.close();
        } catch (Exception e) {
            System.out.println(" se podrucio un error " + e);
        }
    }

    public static void main(String[] args) {
        LeeryEscribir objeto = new LeeryEscribir();
        Persona ob = new Persona("Jhon1", "puglla", "0995261713", 18, new Mascota("Ban1", 6, 4));
        Persona obe = new Persona("Jhon2", "puglla", "0995261713", 18, new Mascota("Ban2", 6, 4));
        Persona obej = new Persona("Jhon3", "puglla", "0995261713", 18, new Mascota("Ban3", 6, 4));
        Persona objec = new Persona("Jhon4", "puglla", "0995261713", 18, new Mascota("Ban4", 6, 4));
        List<Persona> lista = new ArrayList<>();//creamos la lista para guardar objetos
        //una vez que creamos la lista, ponemos los objetos dentro de ella
        lista.add(ob);
        lista.add(obe);
        lista.add(obej);
        lista.add(objec);
        objeto.EscribirLista("C:\\Users\\ISTLOJAV\\Desktop\\123.txt", lista);

        //objeto.escribirObjeto("C:\\Users\\ISTLOJAV\\Desktop\\123.txt", ob);
        //objeto.leerArchivo("C:\\Users\\ISTLOJAV\\Desktop\\123.txt");
    }
}

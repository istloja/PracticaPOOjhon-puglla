/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo_Tarea_prueba;

import java.io.File;
import java.io.FileReader;

/**
 *
 * @author Usuario
 */
public class Fichero {

    public static void mostrarFichero() {
        FileReader fr = null;

        try {
            File fichero = new File("pp.txt");
            fr = new FileReader(fichero);

            leerFichero(fr);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            if (fr != null) {
                try {
                    fr.close();
                } catch (Exception e) {
                    System.out.println(e.getMessage());
                }
            }
        }
    }

    public static void leerFichero(FileReader fr) throws Exception {
        int letra;
        char caracter;
        letra = fr.read();
        while (letra != -1) {
            caracter = (char) letra;
            System.out.print(caracter);
            letra = fr.read();
        }
    }

    public static void main(String[] args) {
        mostrarFichero();
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.File;

/**
 *
 * @author ISTLOJJA
 */
public class Archivos {

    public static void main(String[] args) {
        File archivo = new File("C:\\Users\\ISTLOJJA\\Desktop/ejemplo.txt");//CREANDO UN OBJETO DE LA CLASE ARCHIVO
        //en las comillas va el nombre y la direccion del archivo
        System.out.println(archivo.exists());
        System.out.println(archivo.isDirectory());
        //PARA SABER SI UN ARCHIVO O NO
        System.out.println(archivo.isFile());
        //PARA SABER SI UN ARCHIVO ESTA OCUALTO O NO
        System.out.println(archivo.isHidden());
        //PARA SABER LA ULTIMA FECHA DE MODIFICACION
        System.out.println(archivo.lastModified());
        archivo.delete();
        File carpeta = new File("C:\\Users\\ISTLOJJA\\Desktop");
        //Carpeta.list devuelve un arreglo con los archivos de una carpeta
        String[] arregloarchivos = carpeta.list();
        for (int i = 0; i < arregloarchivos.length; i++) {
            System.out.println(arregloarchivos);
        }
    }

}

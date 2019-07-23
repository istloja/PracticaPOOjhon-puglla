
import java.io.File;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Usuario
 */
public class Tarea {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("escribe 1 para listar archivos de documentos");
        System.out.println("escribe 2  para listar archivos de imagenes");
        System.out.println("escribe 3  para listar archivos de musica");
        System.out.println("escribe 4  para listar archivos de videos");
        System.out.println("escribe 5  para listar archivos de NeatBeans");

        int opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                File carpeta = new File("C:\\Users\\Usuario\\Documents");
                String[] arregloarchivos = carpeta.list();
                for (String arregloarchivo : arregloarchivos) {
                    System.out.println(arregloarchivo);
                }

            case 2:
                File carpeta1 = new File("C:\\Users\\Usuario\\Pictures");
                String[] arregloarchivos1 = carpeta1.list();
                for (String arregloarchivos11 : arregloarchivos1) {
                    System.out.println(arregloarchivos11);
                }
            case 3:
                File carpeta2 = new File("C:\\Users\\Usuario\\Music");
                String[] arregloarchivos2 = carpeta2.list();
                for (String arregloarchivos21 : arregloarchivos2) {
                    System.out.println(arregloarchivos21);
                }
            case 4:
                File carpeta3 = new File("C:\\Users\\Usuario\\Videos");
                String[] arregloarchivos3 = carpeta3.list();
                for (String arregloarchivos31 : arregloarchivos3) {
                    System.out.println(arregloarchivos31);
                }
            case 5:
                File carpeta4 = new File("C:\\Users\\Usuario\\Documents\\NetBeansProjects");
                String[] arregloarchivos4 = carpeta4.list();
                for (String arregloarchivos41 : arregloarchivos4) {
                    System.out.println(arregloarchivos41);
                }
            default:
                System.out.println("escribe un numero  que estes viendo  en  la lista porfavor o no SABES LEER");
        }

    }

}

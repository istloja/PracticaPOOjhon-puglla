/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Fechas;

import Archivos.Archivos;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 *
 * @author ISTLOJJA
 */
public class fechas {

//    public static void main(String[] args) {
//        Date fechaActual = new Date();
//        System.out.println(fechaActual);
//        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyy");
//        Scanner entrada = new Scanner(System.in);
//        System.out.println("ingrese la fecha en el formato dd/MM/yyy");
//        String fecha = entrada.nextLine();
//        Date fechanacimiento = null;
//        try {
//
//            fechanacimiento = formato.parse(fecha);//pasando del String a fecha
//            System.out.println(fechanacimiento);
//            System.out.println(fechanacimiento.before(fechaActual));
//        } catch (Exception e) {
//            System.out.println(e);
//
//        }
//        GregorianCalendar calendario = new GregorianCalendar();//permite manejar fechas
//        calendario.setTime(fechaActual);
//        int añoActual = calendario.get(GregorianCalendar.YEAR);
//        int mesactual = calendario.get(GregorianCalendar.MONTH) + 1;
//        int diactual = calendario.get(GregorianCalendar.DAY_OF_MONTH);
////        System.out.println("añoActual"+añoActual+"mesactual"+mesactual+"diactual"+diactual);
//        GregorianCalendar calendario1 = new GregorianCalendar();
//        calendario1.setTime(fechanacimiento);
//        int añoActual1 = calendario1.get(GregorianCalendar.YEAR);
//        int mesactual1 = calendario1.get(GregorianCalendar.MONTH) + 1;
//        int diaactual1 = calendario1.get(GregorianCalendar.DAY_OF_MONTH);
//        System.out.println("añoActual1" + añoActual + "mesActual" + mesactual1 + "diactual" + diactual);
//        try {
//            fechanacimiento = formato.parse(fecha);//pasando del String a fecha
//            System.out.println(fechanacimiento);
//            System.out.println(fechanacimiento.before(fechaActual));
//        } catch (Exception e) {
//            System.out.println(e);
//
//        }
//    }
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        fechas objeto = new fechas();
        String texto;
        objeto.leerArchivo("C:\\Users\\ISTLOJJA\\Desktop/ejemplo.txt");
        objeto.escribirArchivo("C:\\Users\\ISTLOJJA\\Desktop/ejemplo.txt","texto");
        System.out.println("ingresar un texto");
        texto=entrada.nextLine();
        
    }

    public void leerArchivo(String direccion) {
        File archivo = new File(direccion);
        try {
            FileReader reader = new FileReader(archivo);//nos convierte el archivo aun objeto
            BufferedReader recorrido = new BufferedReader(reader);//recorre el objeto
            String linea;
            while ((linea = recorrido.readLine()) != null) {//mostrar en un pantalla
                System.out.println(linea);
            }
        } catch (Exception e) {
            System.out.println(e);

        }

    }
    public void escribirArchivo(String direccion, String texto){
        try{
        FileWriter archivo=new FileWriter(direccion);
        PrintWriter escribir = new PrintWriter(archivo);
        escribir.println(texto);
        archivo.close();
        }
        catch(Exception e){
            System.out.println(e);
    }

}
   
}


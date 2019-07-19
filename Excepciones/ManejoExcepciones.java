/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones;

import java.util.Scanner;

/**
 *
 * @author ISTLOJJA
 */
public class ManejoExcepciones {
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        System.out.println("escriba un numero");
        int numero=0;
        try{// ponemos el codigo que que queremos proteger 
        int   num=entrada.nextInt();
//        System.out.println("el numero ingresado es "+num);
        } catch (Exception e){ // ponemos la expcepcion a capturar
            System.out.println("se genero el error"+e);
         System.out.println("por favor ingrese un numero correcto");
//            
        }
       int resultado=numero/0;
        System.out.println(resultado);
    }
}

package GENERACION;



import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ISTLOJJA
 */
public class Generaciones {
    public static void main(String[] args) {
         
        Scanner entrada = new Scanner(System.in);
        System.out.println("ingresa 1 si naciste de 1930 a 1948");
        System.out.println("ingresa 2 si naciste de 1949 a 1968");
        System.out.println("ingresa 3 si naciste de 1969 a 1980");
        System.out.println("ingresa 4 si naciste de 1981 a 1993");
        System.out.println("ingresa 5 si naciste de 1994 a 2010");
        int opcion= entrada.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("silent generation - los niños de la posguerra");
                break;
            case 2:
                System.out.println("baby boom");
                break;
            case 3:
                System.out.println("Generacion X");
                break;
            case 4:
                System.out.println("Generacion Y o millennials");
                break;
            case 5:
                System.out.println("Generacion Z");
                break;
            default:
                System.out.println("ingrese un numero correcto:");
                break;
        }
        }
    }


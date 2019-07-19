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
public class Calculadora {
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        System.out.println("1 para suma");
        System.out.println("2 par resta");
        System.out.println("3para multiplicar");
        System.out.println("4 para dividir ");
        int jp = entrada.nextInt();
        switch (jp){
            case 1 :
                try {
                    System.out.println("ingrese dos numeros");
                    int numero=entrada.nextInt();
                    int numero2 =entrada.nextInt();
                    int r = numero+numero2;
                    System.out.println("la suma es "+r);
                } catch (Exception e) {
                }
            break;
            case 2:
                try {
                    System.out.println("escribe dos numeros para la resta");
                    int resta1=entrada.nextInt();
                    int resta2=entrada.nextInt();
                    int Resultado=resta1-resta2;
                    System.out.println("la resta"+Resultado);
                } catch (Exception e) {
                }
            break;
            case 3:
                try {
                    System.out.println("escribe dos numeros para multiplicar");
                    int mul1=entrada.nextInt();
                    int mult2= entrada.nextInt();
                    int res= mul1*mult2;
                    System.out.println("la respuesta de la multiplicacion es "+res);
                } catch (Exception e) {
                }
            break;
            case 4:
                try {
                    System.out.println("escribe dos numeros para dividir ");
                    int div1=entrada.nextInt();
                    int div2=entrada.nextInt();
                    int divres=div1/div2;
                    System.out.println("el resultado es "+divres);
                } catch (Exception e) {
                }
                
        }
                
    }
}

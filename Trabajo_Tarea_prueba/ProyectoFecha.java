/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo_Tarea_prueba;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ProyectoFecha {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d, m, a;
        System.out.println("Introduce fecha: ");
        System.out.print("dia: ");
        d = sc.nextInt();
        System.out.print("mes: ");
        m = sc.nextInt();
        System.out.print("año: ");
        a = sc.nextInt();
        Fecha fecha = new Fecha(d,m,a);{
    }
if (fecha.fechaCorrecta()) { 

          
            System.out.println("Fecha introducida: " + fecha);

            
            System.out.println("Los 10 días siguientes son:");
            for (int i = 1; i <= 10; i++) {
                fecha.diaSiguiente();
                System.out.println(fecha);
            }

        } else { 
            System.out.println("Fecha no valida");
        }
    }
}
        
   

    
     




    

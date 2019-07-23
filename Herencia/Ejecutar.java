/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import java.util.Scanner;

/**
 *
 * @author ISTLOJA V
 */
public class Ejecutar {
    public static void main(String[] args) {
        Scanner entrada =new Scanner(System.in);
        System.out.println("ingrese 1 para circulo 2 para"
                + "triangulo y 3 para cuadrado");
        int valor = entrada.nextInt();
        switch (valor){
            case 1:
                System.out.println("es un circulo");
                double radio=entrada.nextDouble();
                Circulo objeto=new Circulo();
                double areacirculo=objeto.CalcularArea(radio);
                double perimetroCirculo=objeto.calcularPerimetro(radio);
                System.out.println("este es el area" +areacirculo+" el perimetroe"+perimetroCirculo);
                break;// este va despues de cada case
            case 2:
                System.out.println("ingrese el lado del triangulo");
                double lado1=entrada.nextDouble();
                double lado2=entrada.nextDouble();
                double lado3=entrada.nextDouble();
                Triangulo ojeto=new Triangulo();
                double areaTriangulo=ojeto.CalcularPerimetro(lado1,lado2,lado3);
                double PerimetroAngulo=ojeto.CalcularPerimetro(lado1,lado2,lado3);
                System.out.println("este es el area"+areaTriangulo+"este es el perimetro"+PerimetroAngulo);
                break;
            case 3:
                System.out.println("es un cuadrado");
             double lado=entrada.nextDouble();
             Cuadrado objeto1=new Cuadrado();
             double AreaCuadrado=objeto1.calcularPerimetro( lado);
             double PerimetroCuadrado=objeto1.calcularPerimetro(lado);
                System.out.println("este es area"+AreaCuadrado+"este es Perimetro"+PerimetroCuadrado);
                break;
            default:
                System.out.println("ingrese un numero correcto");
                break;
                
        }
        
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author ISTLOJA V
 */
public class Circulo extends Fijurabidimencional {
       public double CalcularArea(double radio){
           return radio*Math.pow(Math.PI, 2);
       }
       public double calcularPerimetro(double radio){
           return radio*(2*Math.PI);
       }
     }

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
public class Transformador {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        System.out.println("ingresa 1 si quieres transformar de kimometros a metros");
        System.out.println("ingresa 2 si quieres transformar de metros a quilometros");
        System.out.println("ingresa 3 si quieres transformar de millas a metros");
        System.out.println("ingresa 4 si quieres transformar de metros a millas");
        System.out.println("ingresa 5 si quieres transformar de pies a metros");
        System.out.println("ingresa 6 si quieres transformar de metros a pies");
        int opcion = entrada.nextInt();
        switch (opcion) {
            case 1:
                System.out.println("vas a tranformar de kilometros a metros");
                System.out.println("ingrese los kilometros para tranformar a metros");
                double km = entrada.nextDouble();
                int m = 1000;
                double resultadoenmetros;
                resultadoenmetros = km * m;
                System.out.println("los kilometros a metros es igual a: " + resultadoenmetros);
                break;
            case 2:
                System.out.println("vas a transformar de metros a kilometros");
                System.out.println("ingrese los metros para tranformar a kilometros");
                double me = entrada.nextDouble();
                int kilometros = 1000;
                double resultadoenkilometros;
                resultadoenkilometros = me / kilometros;
                System.out.println("los metros a kilometros es igual a: " + resultadoenkilometros);
                break;
            case 3:
                System.out.println("vas a transformar de millas a metros");
                System.out.println("ingrese las millas para tranformar a metros");
                double mi = entrada.nextDouble();
                double metros = 1609.34;
                double resultado;
                resultado = mi * metros;
                System.out.println("los kilometros a metros es igual a: " + resultado);
                break;
            case 4:
                System.out.println("vas a transformar de metros a millas");
                System.out.println("ingrese los metros para tranformar a millas");
                double met = entrada.nextDouble();
                double millas = 1609.34;
                double res;
                res = met / millas;
                System.out.println("los metros a millas es igual a: " + res);
                break;
            case 5:
                System.out.println("vas a transformar de pies a metros");
                System.out.println("ingrese los pies para tranformar a metros");
                double pies = entrada.nextDouble();
                double metr = 3.28084;
                double resulta;
                resulta = pies / metr;
                System.out.println("los pies a metros es igual a: " + resulta);
                break;
            case 6:
                System.out.println("vas a transformar de metros a pies");
                System.out.println("ingrese los metros para tranformar a pies");
                double metro = entrada.nextDouble();
                double pie = 3.28084;
                double result;
                result = metro * pie;
                System.out.println("los metros a pies es igual a: " + result);
                break;
            default:
                System.out.println("ingrese un valor correcto:");
                break;
        }
    }
}

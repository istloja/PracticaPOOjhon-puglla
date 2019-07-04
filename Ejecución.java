/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import Pilas_yColas.*;

/**
 *
 * @author Usuario
 */
public class Ejecución {

    public static void pila() {
        pilaLista pila = new pilaLista();
        pila.insertar(1);
        pila.insertar(2);
        pila.insertar(3);
        pila.insertar(4);
        pila.insertar(5);
        pila.insertar(6);
        print("" + pila.quitar());
        print("" + pila.quitar());
        print("" + pila.quitar());
        print("" + pila.quitar());
        print("" + pila.quitar());
        print("" + pila.quitar());
    }

    public static void cola() {
        ColaLista cola = new ColaLista();

        cola.insertar(1);
        cola.insertar(2);
        cola.insertar(3);
        cola.insertar(4);
        cola.insertar(5);
        cola.insertar(6);

        print("" + cola.quitar());
        print("" + cola.quitar());
        print("" + cola.quitar());
        print("" + cola.quitar());
        print("" + cola.quitar());
        print("" + cola.quitar());

    }

    public static void main(String[] args) {
        cola();
    }

    public static void print(String numero) {

        System.out.println(numero);
    }
}

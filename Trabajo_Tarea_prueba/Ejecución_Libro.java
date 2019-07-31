/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Trabajo_Tarea_prueba;

/**
 *
 * @author Usuario
 */
public class Ejecución_Libro {

    public static void main(String[] args) {

        Libro libro1 = new Libro(777777, "titulo1", "autor1", 30);
        Libro libro2 = new Libro(12345672, "titulo2", "autor2", 60);

        System.out.println(libro1.toString());
        System.out.println(libro2.toString());

        libro1.setNumPaginas(70);

        if (libro1.getNumPaginas() > libro2.getNumPaginas()) {
            System.out.println(libro1.getTitulo() + " tiene más páginas");
        } else {
            System.out.println(libro2.getTitulo() + " tiene más páginas");
        }

    }

}

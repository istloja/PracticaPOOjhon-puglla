/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repaso_POO;

/**
 *
 * @author ISTLOJJA
 */
public class Ejecutar {

    public static void main(String[] args) {
        Animal objeto = new Animal("jirafa", "12", 16, 23, "amarillo", 12);
//        Ave objetoave = new ave(12, false, "loro", "13", false, false, "verde", true);
        Mamífero objetomamifero = new Mamífero(6, "perro", "perro", 3, 79, "cafe", 46);
        System.out.println(objeto.informacionAnimal());
//        System.out.println(objetoave.informacionAnimal());
        System.out.println(objetomamifero.informacionAnimal());
    }
}

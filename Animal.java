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
public class Animal {

    private String nombre;
    private String Edad;
    private double edad;
    private double peso;
    private String color;
    private double Altura;

    public Animal() {
    }

    public Animal(String nombre, String Edad, double edad, double peso, String color, double Altura) {
        this.nombre = nombre;
        this.Edad = Edad;
        this.edad = edad;
        this.peso = peso;
        this.color = color;
        this.Altura = Altura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    public double getedad() {
        return edad;
    }

    public void setEdad(double edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getAltura() {
        return Altura;
    }

    public void setAltura(double Altura) {
        this.Altura = Altura;
    }

    public void nombreAnimal() {
        System.out.println("hola soy un animal ");
    }

    public String informacionAnimal() {
        String informacion = nombre + " " + color + " " + Altura + " " + peso;
        return informacion;
    }

    public static void main(String[] args) {
        Animal Objeto = new Animal();
        Objeto.setNombre("perro");
        Objeto.setEdad(10);
        Objeto.setAltura(15);
        Objeto.setPeso(34.2);
        Objeto.setColor("blanco");
        System.out.println(Objeto.informacionAnimal());
        Animal objeto1=new Animal("gato","5",9,15,"verde",15);
        System.out.println(objeto1.informacionAnimal());

    }
}

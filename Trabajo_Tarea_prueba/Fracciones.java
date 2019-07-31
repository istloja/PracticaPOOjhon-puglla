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
public class Fracciones {
    public static void main(String[] args) {
        
        Fracciones f1 = new fracciones (1, 4); 
        Fracciones  f2 = new Fraccion(1, 2); 
        Fracciones f3 = new Fraccion(); 
        Fracciones f4 = new Fraccion(4); 
        
        Fracciones suma = f1.sumar(f2);
        Fracciones resta = f1.restar(f3);
        Fracciones producto = f1.multiplicar(f4);
        Fracciones cociente = f1.dividir(f2);
        //mostrar resultados
        System.out.println(f1 + " + " + f2 + " = " + suma);
        System.out.println(f1 + " - " + f3 + " = " + resta);
        System.out.println(f1 + " * " + f4 + " = " + producto);
        System.out.println(f1 + " / " + f2 + " = " + cociente);
}
    private int mcd(){
     int u=Math.abs(num);
     int v=Math.abs(den);
     if(v==0){
          return u;
     }
     int r;
     while(v!=0){
          r=u%v;
          u=v;
          v=r;
     }
     return u;
}
    public Fracciones (int num, int den) {
        this.num = num;
        if(den==0){
            den = 1;
        }
        this.den = den;
        simplificar();
    }
    public Fracciones () {
        this.num = 0;
        this.den = 1;
}
    public Fracciones (int num) {
        this.num = num;
        this.den = 1;
}
    Fracciones suma = f1.sumar(f2);
Fracciones resta = f1.restar(f3);
Fracciones producto = f1.multiplicar(f4);
Fracciones cociente = f1.dividir(f2);
}


}
public Fraccion sumar(Fraccion f) {
        Fraccion aux = new Fraccion();  //fracción para guardar la suma
        aux.num = this.num * f.den + this.den * f.num;
        aux.den = this.den * f.den;
        aux.simplificar();  //se simplifica antes de devolverla
        return aux;
}


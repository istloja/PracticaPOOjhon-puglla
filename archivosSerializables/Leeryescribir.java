/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosSerializables;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ISTLOJJA
 */
public class Leeryescribir {
     public void escribirObjeto(String nombre,Jugador Apellido) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            escritor.writeObject(Jugador);
            escritor.close();
        } catch (Exception e) {
            System.out.println(" se produjo un error " + e);
        }
        
        }
     public void leerArchivo(String direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(direccion));
            Object auxiliar = lector.readObject();
            Jugador objeto = (Jugador) auxiliar;
            System.out.println(objeto.getNombre().getJugador() + " su edad es es: " + objeto.getEdad());
        } catch (Exception e) {
            System.out.println(e);
        }

    }
      public void leerLista(String url) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(url));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Jugador p1 = (Jugador) auxiliar;
                System.out.println(p1.getJugador().getNombre() + "su edad es:" + p1.getEdad());
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
       public List<Jugador> leerJugador(String url) {
        List<Jugador> Lista = new ArrayList<>();
       try{
           ObjectInputStream lector=new ObjectInputStream(new FileInputStream(url));
           Object auxiliar = lector .readObject();
           while (auxiliar!=null){
               Jugador p1=(Jugador)auxiliar;
               Lista.add(p1);
               auxiliar=lector.readObject();
               
           }
            
        }catch (Exception e){
            System.out.println(e);
        }
               
     return Lista;           
                

    }
       public int EdadMayor(List<Jugador>Lista){
           int EdadMayor=lista.get(0).getEdad();
           for (Jugador jugador :lista {
               if (jugador.getEdad()>edadMayor){
                   
               }
               
           }
           return edadmayor;
           
       }
       
       public void EscribirLista(String direccion, List<Jugador> lista) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            for (Jugador jugador : lista) {
                escritor.writeObject(jugador);

            }
            escritor.close();
        } catch (Exception e) {
            System.out.println(" se podrucio un error " + e);
        }
    }
public static void main(String[] args) {
        Jugador  j1 = new Jugador("Cristiano ", "Ronaldo", 33,520,2005,new Equipo ("Juventus",20, "Turin"));
        Jugador  j2 = new Jugador("Lionel ", "Messi", 31,600,2007,new Equipo ("Barcelona", 20,"Barcelona"));
        Jugador  j3 = new Jugador("Neymar ", "Jr", 28,200,2011,new Equipo("PSG", 10,"Paris"));
        Jugador  j4 = new Jugador("Eden ", "Hazard", 27,1590,2010,new Equipo("Real madrid", 48,"madrid"));
        List<Jugador> lista = new ArrayList<>();
        lista.add(j1);
        lista.add(j2);
        lista.add(j3);
        lista.add(j4);
      
        int a = lista.size();
        System.out.println(a);
        for (Jugador jugador: lista) {
            System.out.println(jugador.getNombre() + "" + jugador.getApellido() + "" + jugador.getEdad());
        }
        Jugador.escribirLista("‪C:\\Users\\ISTLOJJA\\Documents\\ejemplo (1).tx",Lj);
       Jugador.leerLista("‪C:\\Users\\ISTLOJJA\\Documents\\ejemplo (1).tx");
        List<Jugador> b = j1.leerJugador("‪C:\\Users\\ISTLOJJA\\Documents\\ejemplo (1).tx");
        for (Jugador persona :b){
            System.out.println(persona.getEdad());
        }
        

    }
//public edadMayor (List<Jugador> lista){
//    int edadMayor
//    
}
public int edadMayor(list<Jugador>lista){
int edadMayor=lista.get(0).get


}



  
    


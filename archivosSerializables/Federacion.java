/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package archivosSerializables;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ISTLOJJA
 */
public class Federacion implements Serializable {

    private String Nombre;
    private String pais;
    private int numEquipos;

    public Federacion() {
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public int getNumEquipos() {
        return numEquipos;
    }

    public void setNumEquipos(int numEquipos) {
        this.numEquipos = numEquipos;
    }

    public Federacion(String Nombre, String pais, int numEquipos) {
        this.Nombre = Nombre;
        this.pais = pais;
        this.numEquipos = numEquipos;
    }

    public void EscribirLista(String direccion, List<Federacion> lista) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(direccion));
            
            for (Federacion jugador : lista) {
                escritor.writeObject(jugador);
            }
            escritor.close();
        } catch (Exception e) {
            System.out.println(" se podrucio un error " + e);
        }
    }
//        public Federacion masEquipo
//                
//
//    
//
//}
//
//    public static void main(String[] args) {
//        Federacion objeto = new Federacion();
//        Federacion F1 = new Federacion(" Mexico ", "Brazil", 12);
//        Federacion F2 = new Federacion(" Argentina ", " ECUADOR", 28);
//
//        List<Federacion> lista = new ArrayList<>();
//        lista.add(objeto);
//        lista.add(F1);
//        lista.add(F2);
//
//        int a = lista.size();
//        System.out.println(a);
//
//    }


    
    


//}

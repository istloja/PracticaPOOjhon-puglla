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
import java.io.Serializable;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;

/**
 *
 * @author ISTLOJJA
 */
public class Jugador implements Serializable {

    private String nombre;
    private String apellido;
    private int edad;
    private int numeroGoles;
    private int añoDebut;
    private Equipo equipo;
    private int perdidas_de_balon;
    private int asistencias;
    private double km_recorridos;
    private int pases_completados;
    private int fallos_gol;

    public Jugador() {
    }

    public Jugador(String nombre, String apellido, int edad, int numeroGoles, int añoDebut, Equipo equipo, int perdidas_de_balon, int asistencias, double km_recorridos, int pases_completados, int fallos_gol) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.numeroGoles = numeroGoles;
        this.añoDebut = añoDebut;
        this.equipo = equipo;
        this.perdidas_de_balon = perdidas_de_balon;
        this.asistencias = asistencias;
        this.km_recorridos = km_recorridos;
        this.pases_completados = pases_completados;
        this.fallos_gol = fallos_gol;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getNumeroGoles() {
        return numeroGoles;
    }

    public void setNumeroGoles(int numeroGoles) {
        this.numeroGoles = numeroGoles;
    }

    public int getAñoDebut() {
        return añoDebut;
    }

    public void setAñoDebut(int añoDebut) {
        this.añoDebut = añoDebut;
    }

    public Equipo getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipo equipo) {
        this.equipo = equipo;
    }

    public int getPerdidas_de_balon() {
        return perdidas_de_balon;
    }

    public void setPerdidas_de_balon(int perdidas_de_balon) {
        this.perdidas_de_balon = perdidas_de_balon;
    }

    public int getAsistencias() {
        return asistencias;
    }

    public void setAsistencias(int asistencias) {
        this.asistencias = asistencias;
    }

    public double getKm_recorridos() {
        return km_recorridos;
    }

    public void setKm_recorridos(double km_recorridos) {
        this.km_recorridos = km_recorridos;
    }

    public int getPases_completados() {
        return pases_completados;
    }

    public void setPases_completados(int pases_completados) {
        this.pases_completados = pases_completados;
    }

    public int getFallos_gol() {
        return fallos_gol;
    }

    public void setFallos_gol(int fallos_gol) {
        this.fallos_gol = fallos_gol;
    }

    public void escribirObjeto(String Direccion, Jugador jugador) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(Direccion));
            escritor.writeObject(jugador);
            escritor.close();
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
    }

    public void escribirLista(String Direccion, List<Jugador> lj) {
        try {
            ObjectOutputStream escritor = new ObjectOutputStream(new FileOutputStream(Direccion));
            for (Jugador jugador : lj) {//para crear una lista
                escritor.writeObject(jugador);
            }
            escritor.close();
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
    }

    public void leerArchivo(String Direccion) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(Direccion));
            Object auxiliar = lector.readObject();
            Jugador jugador = (Jugador) auxiliar;//cambio de objeto a persona
            System.out.println("el jugador se llama se llama: " + jugador.getNombre() + " " + jugador.getApellido() + " su edad es: " + jugador.getEdad() + " sus numeros de goles son " + jugador.getNumeroGoles() + " su año de debut es: " + jugador.getAñoDebut() + " su equipo es: " + jugador.getEquipo().getNombre() + " tiene " + jugador.getEquipo().getNumerotitulos() + " titulos y es de la ciudad de " + jugador.getEquipo().getCiudad());
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
    }

    public List<Jugador> LeerJugadores(String dire) {
        List<Jugador> lj = new ArrayList<>();//creamos la lista para guardar objetos
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(dire));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Jugador jugador = (Jugador) auxiliar;
                lj.add(jugador);
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
        return lj;

    }

    public void LeerLista(String dir) {
        try {
            ObjectInputStream lector = new ObjectInputStream(new FileInputStream(dir));
            Object auxiliar = lector.readObject();
            while (auxiliar != null) {
                Jugador jugador = (Jugador) auxiliar;
                System.out.println("el jugador se llama se llama: " + jugador.getNombre() + " " + jugador.getApellido() + " su edad es: " + jugador.getEdad() + " sus numeros de goles son " + jugador.getNumeroGoles() + " su año de debut es: " + jugador.getAñoDebut() + " su equipo es: " + jugador.getEquipo().getNombre() + " tiene " + jugador.getEquipo().getNumerotitulos() + " titulos y es de la ciudad de " + jugador.getEquipo().getCiudad());
                auxiliar = lector.readObject();
            }
        } catch (Exception e) {
            System.out.println("se produjo un error " + e);
        }
    }

    public Jugador edadMayor(List<Jugador> lj) {
        Jugador edadmayor = lj.get(0);
        for (Jugador jugador : lj) {
            //System.out.println("la edad mayor es: " + edadmayor + " la edad del objeto es " + jugador.getEdad());
            if (jugador.getEdad() > edadmayor.getEdad()) {
                edadmayor = jugador;
            }
        }
        return edadmayor;
    }

    public Jugador edadMenor(List<Jugador> lj) {
        Jugador edadmenor = lj.get(0);
        for (Jugador jugador : lj) {
            //System.out.println("la edad mayor es: " + edadmenor + " la edad del objeto es " + jugador.getEdad());
            if (jugador.getEdad() < edadmenor.getEdad()) {
                edadmenor = jugador;
            }
        }
        return edadmenor;
    }

    public Jugador masGoles(List<Jugador> lj) {
        Jugador masgoles = lj.get(0);
        for (Jugador jugador : lj) {
            //System.out.println("el numero mayor de goles es: " + masgoles + " la cantidad de goles del objeto es " + jugador.getNumeroGoles());
            if (masgoles.getNumeroGoles() < jugador.getNumeroGoles()) {
                masgoles = jugador;
            }
        }
        return masgoles;
    }

    public Jugador menosGoles(List<Jugador> lj) {
        Jugador menosgoles = lj.get(0);
        for (Jugador jugador : lj) {
//            System.out.println("el numero menor de goles es: " + menosgoles + " la cantidad de goles del objeto es " + jugador.getNumeroGoles());
            if (menosgoles.getNumeroGoles() > jugador.getNumeroGoles()) {
                menosgoles = jugador;
            }
        }
        return menosgoles;
    }

    public Jugador debutP(List<Jugador> lj) {
        Jugador debuto = lj.get(0);
        for (Jugador jugador : lj) {
            if (debuto.getAñoDebut() > jugador.getAñoDebut()) {
                debuto = jugador;
            }

        }
        return debuto;
    }

    public Jugador Titulos(List<Jugador> lj) {
        Jugador masTitulos = lj.get(0);
        for (Jugador jugador : lj) {
            if (masTitulos.getEquipo().getNumeroTitulos() < jugador.getEquipo().getNumeroTitulos()) {
                masTitulos = jugador;
            }

        }
        return masTitulos;
    }

    public Jugador Perdidas_balon(List<Jugador> lj) {
        Jugador perdidas = lj.get(0);
        for (Jugador jugador : lj) {
            if (perdidas.getPerdidas_de_balon() < jugador.getPerdidas_de_balon()) {
                perdidas = jugador;
            }

        }
        return perdidas;
    }

    public Jugador Perdidas_Menos(List<Jugador> lj) {
        Jugador perdidasmenos = lj.get(0);
        for (Jugador jugador : lj) {
            if (perdidasmenos.getPerdidas_de_balon() > jugador.getPerdidas_de_balon()) {
                perdidasmenos = jugador;
            }

        }
        return perdidasmenos;
    }

    public Jugador Mas_Asistencias(List<Jugador> lj) {
        Jugador masasistencias = lj.get(0);
        for (Jugador jugador : lj) {
            if (masasistencias.getAsistencias() < jugador.getAsistencias()) {
                masasistencias = jugador;
            }

        }
        return masasistencias;
    }

    public Jugador Menos_Asistencias(List<Jugador> lj) {
        Jugador menosasistencias = lj.get(0);
        for (Jugador jugador : lj) {
            if (menosasistencias.getAsistencias() > jugador.getAsistencias()) {
                menosasistencias = jugador;
            }

        }
        return menosasistencias;
    }

    public Jugador Mas_km(List<Jugador> lj) {
        Jugador maskilometros = lj.get(0);
        for (Jugador jugador : lj) {
            if (maskilometros.getKm_recorridos() < jugador.getKm_recorridos()) {
                maskilometros = jugador;
            }

        }
        return maskilometros;
    }

    public Jugador Menos_km(List<Jugador> lj) {
        Jugador menoskilometros = lj.get(0);
        for (Jugador jugador : lj) {
            if (menoskilometros.getKm_recorridos() > jugador.getKm_recorridos()) {
                menoskilometros = jugador;
            }

        }
        return menoskilometros;
    }

    public Jugador Mas_Pases(List<Jugador> lj) {
        Jugador maspases = lj.get(0);
        for (Jugador jugador : lj) {
            if (maspases.getPases_completados() < jugador.getPases_completados()) {
                maspases = jugador;
            }

        }
        return maspases;
    }

    public Jugador Menos_Pases(List<Jugador> lj) {
        Jugador menospases = lj.get(0);
        for (Jugador jugador : lj) {
            if (menospases.getPases_completados() > jugador.getPases_completados()) {
                menospases = jugador;
            }

        }
        return menospases;
    }

    public Jugador Mas_FallosGol(List<Jugador> lj) {
        Jugador numfallos = lj.get(0);
        for (Jugador jugador : lj) {
            if (numfallos.getFallos_gol() < jugador.getFallos_gol()) {
                numfallos = jugador;
            }

        }
        return numfallos;
    }

    public Jugador Menos_FallosGol(List<Jugador> lj) {
        Jugador numfallosmenos = lj.get(0);
        for (Jugador jugador : lj) {
            if (numfallosmenos.getFallos_gol() > jugador.getFallos_gol()) {
                numfallosmenos = jugador;
            }

        }
        return numfallosmenos;
    }

    public double PorcentajeAcierto(Jugador jugador) {
        return (jugador.getNumeroGoles() + jugador.getAsistencias()) / +jugador.getFallos_gol();
    }

    public Jugador MasAcierto(List<Jugador> lj) {
        Jugador masaciertos = lj.get(0);
        for (Jugador jugador : lj) {
            if (PorcentajeAcierto(jugador) > jugador.PorcentajeAcierto(masaciertos)) {
                masaciertos = jugador;
            }
        }
        return masaciertos;
    }

    public double Porcentaje_Efectividad(Jugador jugador) {
        return (jugador.getPases_completados()) / jugador.getPerdidas_de_balon();
    }

    public Jugador Porcentaje_masEfectividad(List<Jugador> lj) {
        Jugador masefectividad = lj.get(0);
        for (Jugador jugador : lj) {
            if (masefectividad.Porcentaje_Efectividad(jugador) > jugador.Porcentaje_Efectividad(masefectividad)) {
                masefectividad = jugador;
            }
        }
        return masefectividad;
    }

    public double Efectividad_jugador(Jugador jugador) {
        return (jugador.PorcentajeAcierto(jugador) + jugador.Porcentaje_Efectividad(jugador) + jugador.getKm_recorridos());
    }

    public Jugador Jugador_Efectivo(List<Jugador> lj) {
        Jugador jugadorefectivo = lj.get(0);
        for (Jugador jugador : lj) {
            if (jugadorefectivo.Efectividad_jugador(jugador) > jugador.Efectividad_jugador(jugadorefectivo)) {
                jugadorefectivo = jugador;
            }
        }
        return jugadorefectivo;
    }

    public static void main(String[] args) {
        Jugador objetos = new Jugador();
        Jugador e1 = new Jugador("Cristiano CR7", "Ronaldo", 33, 520, 2005, new Equipo("Juventus", 20, "Turin"), 1564, 651, 2541.45, 2541, 554);
        Jugador e2 = new Jugador("Leonel M10", "Messi", 31, 600, 2007, new Equipo("Barcelona", 30, "Barcelona"), 546, 1854, 3453.25, 6844, 527);
        Jugador e3 = new Jugador("Neymar Jr", "Jr", 28, 200, 2011, new Equipo("PSG", 10, "Paris"), 3245, 321, 1657.54, 541, 3571);
        Jugador e4 = new Jugador("Eden", "Hazard", 27, 590, 2010, new Equipo("Real Madrid", 40, "Madrid"), 3571, 5451, 1335.38, 2451, 2345);
        List<Jugador> lj = new ArrayList<>();
        lj.add(e1);
        lj.add(e2);
        lj.add(e3);
        lj.add(e4);
//        System.out.println(lj.size());
//        int c = lj.size();
//        System.out.println(c);
//        for (Jugador jugador : lj) {
//            System.out.println(jugador.getNombre());
//        }
//        objetos.leerArchivo("C:\\Users\\ITS LOJA\\Desktop\\leccion.txt");
        objetos.escribirLista("C:\\Users\\ISTLOJJA\\Downloads\\ejemplo.txt", lj);
        //objetos.escribirObjeto("C:\\Users\\ITS LOJA\\Desktop\\leccion.txt", e4);
//        objetos.LeerLista("C:\\\\Users\\\\ITS LOJA\\\\Desktop\\\\leccion.txt");
//        objetos.GuardarLista("C:\\Users\\ITS LOJA\\Desktop\\leccion.txt");
        List<Jugador> b = objetos.LeerJugadores("C:\\Users\\ISTLOJJA\\Downloads\\ejemplo.txt");
//        for (Jugador jugador : b) {
//            System.out.println(jugador.getEdad() + " años");
//        }
//        System.out.println("la edad mayor de los jugadores es: " + objetos.edadMayor(b).getEdad());
//        System.out.println("la edad menor de los jugadores es: " + objetos.edadMenor(b).getEdad());
//        System.out.println("el mayor numero de goles es: " + objetos.masGoles(b).getNumeroGoles());
//        System.out.println("el numero menor de goles es:" + objetos.menosGoles(b).getNumeroGoles());
//        System.out.println("el año de debut es: " + objetos.debutP(b).getAñoDebut());
//        System.out.println("el numero de titulos maximo es: " + objetos.Titulos(b).getEquipo().getNumerotitulos());
        System.out.println("el mayor numero de perdidas de balon  es: " + objetos.Perdidas_balon(b).getPerdidas_de_balon());
        System.out.println("el menor numero de perdidas de balon es: " + objetos.Perdidas_Menos(b).getPerdidas_de_balon());
        System.out.println("el mayor numero de asistencias es: " + objetos.Mas_Asistencias(b).getAsistencias());
        System.out.println("el menor numero de asistencias es: " + objetos.Menos_Asistencias(b).getAsistencias());
        System.out.println("el mayor numero de kilometros recorridos es: " + objetos.Mas_km(b).getKm_recorridos());
        System.out.println("el menor numero de kilometros recorridos es: " + objetos.Menos_km(b).getKm_recorridos());
        System.out.println("el mayor numero de pases es: " + objetos.Mas_Pases(b).getPases_completados());
        System.out.println("el menor numero de pases  es: " + objetos.Menos_km(b).getKm_recorridos());
        System.out.println("el mayor numero de fallos de gol es: " + objetos.Mas_FallosGol(b).getFallos_gol());
        System.out.println("el menor numero de fallos de gol es: " + objetos.Menos_FallosGol(b).getFallos_gol());
        System.out.println("el que tiene mas porcentaje de acierto es: " + objetos.Mas_Acierto(b).getNombre());
        System.out.println("el que tiene mas porcentaje de efectividad es: " + objetos.Porcentaje_masEfectividad(b).getNombre());
        System.out.println("el jugador mas efectivo es: " + objetos.Jugador_Efectivo(b).getNombre());
    }
}

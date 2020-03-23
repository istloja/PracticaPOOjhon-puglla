/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Alumno;
import Modelo.AlumnoBD;
import Vista.Formulario;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author ISTLOJA_05
 */
public class OyenteVerificarAlumno implements ActionListener {

    Formulario fm;
    AlumnoBD abd;
    Alumno a;

    public OyenteVerificarAlumno(Formulario fm) {
        this.fm = fm;

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
               
       a= abd.buscarAlumno(fm.verificarAlumno());
       // no esta llamar
        if (a.getNumero_de_ID()== null) {
            //no esta llamar-->>
//           fm.bloquearCampos();
          
           fm.desbloquearCampos();
           
        } else {
            //si esta llamar-->>
            fm.limpiarCampos();
            fm.desbloquearCampos();
            fm.cargarCampos(a);
            
           
        }

    }
}

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

/**
 *
 * @author ISTLOJA_04
 */
public class OyenteVerficarEstudiante  implements ActionListener{
   OyenteCrearAlumno vca;
   AlumnoBD abd;
  Alumno a;
  Formulario f;
    
public OyenteVerficarEstudiante (OyenteCrearAlumno  vca){
    this.vca = vca;
         
}
    @Override
    public void actionPerformed(ActionEvent e) {
        f.verificarEstudiante();
        if (a.getNumero_De_Id()==null) {
            f.desbloquerCampos();
            
        }else{
            System.out.println("El Alumno esta Registrado");
            f.cargarCampos(a);
        }
        
        
        
        abd=f.desbloquerCampos(());
       if (a.getNumero_De_Id()==null) {
           vca.desbloquearCampos();            
        }else{
            vca.cargarALUMNOS
        }
       no esta llamar
      vca.desbloquearAlumno();
             abd.buscarAlumno(vca.verificarAlumno);
      if(a.getNumerodeId==null){
           vca.desbloquearAlumno();
      }else{
           vca.cargarCampos();
       }
       vca.cargarCampos();
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    }
    
    
}

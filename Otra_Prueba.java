/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajos_en_clasespoojohnp;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Otra_Prueba extends JFrame {
    JList l ;
    JLabel ta;
    JLabel l1,l2,l3 ;
    JTextField tf;
    JPanel panel ;
    JButton b ;
    
    
    public Otra_Prueba(){
        setVisible(true);
         setBounds(200, 100, 700, 500);
        setTitle("Bebidas Alcoholicas");
        
        panel = new JPanel();
        panel.setBackground(Color.YELLOW);
        setContentPane(panel);
        
        panel.setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        
      
        l=new JList();
        b= new JButton(" Seleccionar");
     
       
        
        l1=new JLabel("Escoga ");
        l2=new JLabel("Grafico de la Bebida");
         l3=new JLabel("Informacion de la Bebida");
        tf=new JTextField();
        
       l1.setBounds(50, 50, 130, 25);
        panel.add(l1);
        
         String[]cx={"cerveza","San Jorge","wiskhy","san Miguel"};
        l=new JList(cx);
     
    
     
        l.setBounds(50, 80, 100, 80);
         panel.add(l);
        
           b.setBounds(50, 170, 120, 20);
         panel.add(b);
         
         l2.setBounds(300, 50, 130, 25);
          panel.add(l2);
          
          
          
         
          
          l3.setBounds(50, 225, 130, 25);
        panel.add(l3);
        
        tf.setBounds(50, 250, 400, 25);
        panel.add(tf);
 


  b.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                   int a =lista(l.getSelectedIndex());
                   
            }

            private int lista(int a) {
                if (a==0) {
                tf.setText("La cerveza ​ es una bebida alcohólica, no destilada");
             
                JLabel l1 =new JLabel(new ImageIcon("cerveza.jpg"));                 
                    l1.setBounds(300, 80, 150, 150);
                     panel.add(l1);
                     
                     
                }
                if (a==1) {
                 
                tf.setText("wiski​ o güisqui​ es una bebida alcohólica obtenida por la destilación de la malta fermentada de cereales como cebada, trigo");
                 JLabel l1 =new JLabel(new ImageIcon("wiskhy.jpg"));                 
                    l1.setBounds(300, 80, 150, 150);
                     panel.add(l1);
                     
                
                }
                if (a==2) {
                tf.setText("Una Cerveza Radler producto de mezclar las proporciones adecuadas de San Miguel Especial y zumo natural del limón. Resultado 100% refrescante.");
                 JLabel l1 =new JLabel(new ImageIcon("San mIGUEL.jpg"));                 
                    l1.setBounds(300, 80, 150, 150);
                     panel.add(l1);
                }
                    if (a==3) {
                tf.setText("  ... Contenido Alcohólico 18%. de grados ");
                 JLabel l1 =new JLabel(new ImageIcon("saN jORGE.jpg"));                 
                    l1.setBounds(300, 80, 200, 150);
                     panel.add(l1);
                    }
                
                return 0;
                }
               
              
            
        });
    }
 
    
    
    public static void main(String[] args) {
        Otra_Prueba o = new Otra_Prueba();
    }

   
}



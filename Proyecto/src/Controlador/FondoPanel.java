/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Oscar
 */
public class FondoPanel extends JPanel
        {
    private Image imagen;
    
    public void paint(Graphics g){
        
        imagen= new ImageIcon(getClass().getResource("/Img/seguridad.jpg")).getImage();
        g.drawImage(imagen, 0,0, getWidth(),getHeight(), this);
        setOpaque(false);
        super.paint(g);
        
    }
    
    
}

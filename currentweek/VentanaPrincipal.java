/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currentweek;

import java.awt.Color;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Calendar;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 *
 * @author ist loja
 */
public class VentanaPrincipal extends JFrame {

    JLabel l = new JLabel("QUEY QUE DESEAS SABER?");
    JTextField t = new JTextField(20);
    JPanel p = new JPanel();
    JButton b = new JButton("chequear");
    VentanaResultado r;
    boolean bandera = true;
   JComboBox<Object> p8 = new JComboBox<Object>();
   
//    JComboBox com;

    public VentanaPrincipal() {
        super("ventana Principal");
        setSize(300, 300);
        setVisible(true);
        setLocation(300, 300);
        agregarComponentes();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();

    }

    public void agregarComponentes() {
        getContentPane().add(p);
        p.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(10, 15, 10, 15);
        p.add(l, c);
        c.gridy = 1;
        p.add(t, c);
        c.gridy = 2;
        p.add(b, c);  
        p.add(p8);
        p8.addItem("Semana del Año");
        p8.addItem("Dia del Año");
        p8.addItem("Dia de la Semana");
        p8.addItem("Dia del Mes");
        

        if (bandera == true);
        b
                .addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        if (!t.getText().isEmpty()) {
                            int a = checkCombo(0);
                            Comprobar(a);
//                    Comprobar();

                        } else {
                            JOptionPane.showMessageDialog(null, "Agrega el numero" + "  de la semana para jugar");
                        }

                    }
                });

    }

    public void Comprobar(int a) {
        try {

            int num = Integer.parseInt(t.getText());
            Calendar cal = Calendar.getInstance();
            int c = cal.get(Calendar.WEEK_OF_YEAR);
            if (num == c) {
                // b.setEnabled(false);
                r = new VentanaResultado();
                r.lr.setText(" ohhhhh! correcto,GANASTE");
                r.lr.setForeground(Color.green);
                r.br.setText("terminar");

            } else {
                // b.setEnabled(false);
                r = new VentanaResultado();
                r.lr.setText(" que sad :c incorrecto,perdiste");
                r.lr.setForeground(Color.PINK);
                r.br.setText("vuelvo a intentarlo men");

            }

        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Por favor agrega un numero para jugar :c");
        }

    }

    public int checkCombo(int a) {
        int c = 0;
        if (a == 0) {
            Calendar cal = Calendar.getInstance();
            c = cal.get(Calendar.WEEK_OF_YEAR);
            return c;

        }
        if (a == 1) {
            Calendar cal = Calendar.getInstance();
            c = cal.get(Calendar.DAY_OF_YEAR);

            return c;
        }

        if (a == 2) {
            Calendar cal = Calendar.getInstance();
            c = cal.get(Calendar.DAY_OF_WEEK);

            return c;
        }

        if (a == 1) {
            Calendar cal = Calendar.getInstance();
            c = cal.get(Calendar.DAY_OF_MONTH);

        }
        return c;
    }
    
}


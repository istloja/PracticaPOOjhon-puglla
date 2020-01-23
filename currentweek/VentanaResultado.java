/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package currentweek;

import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 *
 * @author ist loja
 */
public class VentanaResultado extends JFrame {

    JLabel lr = new JLabel("BIEN");
    JButton br = new JButton("Finalizar");
    JPanel pr = new JPanel();
    VentanaPrincipal vp =new VentanaPrincipal();

    public VentanaResultado() {
        super("ventana REsultado");
        setSize(300, 300);
        agregarComponentes();
        dispose();
        setVisible(true);
        setLocation(300, 300);

//         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void agregarComponentes() {
        getContentPane().add(pr);
        pr.setLayout(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.insets = new Insets(5, 5, 5, 5);
        pr.add(lr, c);
        c.gridy = 1;
        pr.add(br, c);
        br.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (br.getText() == "terminar") {
                    System.exit(0);
                } else {
                    dispose();

                }

            }

        });
    }
}


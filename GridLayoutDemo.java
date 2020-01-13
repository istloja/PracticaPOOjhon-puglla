
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author ist loja
 */
public class GridLayoutDemo extends JFrame {

    GridLayoutDemo() {

        JPanel p1 = new JPanel();

        p1.setLayout(new GridLayout(4, 2));

        FlowLayout layout = new FlowLayout();

        JPanel p2 = new JPanel();

        p2.setLayout(layout);

        JLabel one, two, three, four,five;

        JTextField tname, tsalary, tcode, tdesig;

        JButton buttonSave, buttonExit;

        one = new JLabel("INGRESE SU CORREO ELECTRONICO");

        tname = new JTextField(20);

        two = new JLabel("CONTRASEÑA");
        
        

        tsalary = new JTextField(20);

        buttonExit = new JButton("registrarte");

        p1.add(one);

        p1.add(tname);

        p1.add(two);

        p1.add(tsalary);

        p2.add(buttonExit);

        add(p1, "North");

        add(p2, "South");

        setVisible(true);

        this.setSize(400, 180);
    }

    public static void main(String args[]) {

        new GridLayoutDemo();
    }
}

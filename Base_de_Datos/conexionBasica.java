/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Base_de_Datos;

import com.mysql.jdbc.ResultSet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

/**
 *
 * @author ISTLOJJA
 */
public class conexionBasica {
    
    public void leer(String usuario, String clave) {
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection conect = DriverManager.getConnection("jdbc:mysql://localhost/persona?characterEncoding=latin1", usuario, clave);
            
            System.out.println(conect.getCatalog());
            Statement variable = conect.createStatement();
            ResultSet resultado = (ResultSet) variable.executeQuery("select * from persona");//aqui ponemos la consulta//
            while (resultado.next()) {
                System.out.println(resultado.getString("nombre") + resultado.getString("apellido"));
                
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        
    }
    
    public static void main(String[] args) {
        conexionBasica objeto = new conexionBasica();
        
        objeto.leer("John", "12345");
        
    }
}

 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bryan
 */
public class ConexionBD {
    String UserDb = "root";
    String PassDb = "root";
    String db = "actividad2";
    String URL = "jdbc:mariadb://localhost:3306/" + db;
    Connection con;
    
    
    public Connection getConexion() throws ClassNotFoundException {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            con = DriverManager.getConnection(this.URL, this.UserDb, this.PassDb);
            System.out.println("Conectado!!");
        } catch (SQLException ex) {
            Logger.getLogger(Connection.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Error: "+ex.getMessage());
        }
        return con;
    }
    
    /*public static void main(String args[]) throws ClassNotFoundException{
        ConexionBD c = new ConexionBD();    
        System.out.println(""+c.getConexion());
    }*/
    
    
}

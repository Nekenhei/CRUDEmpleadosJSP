/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import interfaces.CRUD;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author bryan
 */
public class ClienteDAO implements CRUD{
    ConexionBD cn = new ConexionBD();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    Cliente cli = new Cliente();
    
    @Override
    public Cliente list(String user, String pass) {
        String sql = "SELECT * FROM clientetb where Usuario='"+user+"' and Contrasena='"+pass+"'";
        System.out.println(sql);
        
        try {
            con=cn.getConexion();
            ps=con.prepareStatement(sql);
            rs = ps.executeQuery();
            while(rs.next()){               
                cli.setNroId(Integer.parseInt(rs.getString("NroID")));
                cli.setTipoId(rs.getString("TipoID"));
                cli.setNombre(rs.getString("Nombre"));
                cli.setApellido(rs.getString("Apellido"));
                cli.setUsuario(rs.getString("Usuario"));
                cli.setContrasena(rs.getString("Contrasena"));
                cli.setNoCelular(Long.parseLong(rs.getString("NoCelular")));
                cli.setCorreo(rs.getString("Correo"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println(ex.getSQLState());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ClienteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
            return cli;
    } 
}

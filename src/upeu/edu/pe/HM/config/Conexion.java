/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package upeu.edu.pe.HM.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author JESSICA
 */
public class Conexion {
     public static Connection GetConexion() throws ClassNotFoundException, SQLException{
    Connection conex=null;
        Class.forName("com.mysql.jdbc.Driver");
        String url="jdbc:mysql://localhost/bd_clinica";
        String usuario="root";
        String pass ="system";
        conex =(Connection) DriverManager.getConnection(url,usuario,pass);    
    return conex;
    }
    
}

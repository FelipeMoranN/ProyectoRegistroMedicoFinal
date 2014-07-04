/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package upeu.edu.pe.HM.modelo;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import upeu.edu.pe.HM.config.Conexion;

/**
 *
 * @author JESSICA
 */
public class UsuarioDAO {
    int cap;
    Connection cx;
    Statement st;
    ResultSet rs;
    String sql;
    public int validarUsuario(String usu, String pass){
        sql="SELECT *FROM Usuario WHERE Usuario='"+usu
                +"' AND Clave='"+pass+"'";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
         
            if(rs.next()){
               cap=1;
            }else{
                cap=2;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }    
    return cap;
    }
    public int verificarUsuario(String user){
    sql="SELECT *FROM Usuario WHERE Usuario='"+user+"'";
        try {
            cx = Conexion.GetConexion();
            st = cx.createStatement();
            rs = st.executeQuery(sql);
           
            if(rs.next()){
                cap=1;
            }else{
                cap=2;
            }
        } catch (ClassNotFoundException | SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error: "+ex);
        }
        return cap;    
    }
}

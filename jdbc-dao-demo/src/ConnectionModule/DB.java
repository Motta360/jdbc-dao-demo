/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ConnectionModule;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author lucas
 */
public class DB {
    
    public static Connection getConnection(){
        Connection con;
        try {
            
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/coursejdbc", "root", "root");
            return con;
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}

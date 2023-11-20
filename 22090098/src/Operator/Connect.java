/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Operator;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author LENOVO
 */
public class Connect {
    private static Connection koneksidatabase;
    
    private static Connection getConnection() throws SQLException {
        String db = "jdbc:mysql://localhost3306/operator";
        String user = "root";
        String pass = "";
        
        if (koneksidatabase == null) {
            koneksidatabase = DriverManager.getConnection(db,user,pass);
            
        }
        
        return koneksidatabase;
    }
}


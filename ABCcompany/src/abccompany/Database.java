/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package abccompany;

/**
 *
 * @author Methma
 */
import java.sql.Connection;
import java.sql.DriverManager;

import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Database {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "";
    private static final String CONN_STRING = "jdbc:mysql://localhost:3306/resourceallocationcenter";
    private Connection connection;
    
    
    public Database(){
        try{
            connection = DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
        } catch (SQLException e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Failed to connect to the database");
            System.exit(0);
        }
    }
    
    
    public Connection getconnection(){
        return connection;
    }
    
}

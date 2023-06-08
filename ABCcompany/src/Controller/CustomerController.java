/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.Customer;
import abccompany.Database;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import java.sql.SQLException;

/**
 *
 * @author Methma
 */

    
    




public class CustomerController {
   
    private Connection con;
    
    public CustomerController(){
        Database db = new Database();
        con = db.getconnection();
    }
    
    
    public void add(Customer customer){
        
        
            String query ="INSERT INTO customers(fName,lName,DOB,NIC,mobileNum)VALUES(?,?,?,?,?)";
            
        try
              (PreparedStatement pst = con.prepareStatement(query)){
            pst.setString(1, customer.getName());
            pst.setString(2, customer.getSurname());
            pst.setObject(3, customer.getDateOfBirth());
            pst.setString(4, customer.getCusID());
            pst.setString(5, customer.getMobile_number());
            pst.executeUpdate();
            JOptionPane.showMessageDialog(null, "Saved");
            
            
        } catch (SQLException e) {
            e.printStackTrace();;
            JOptionPane.showMessageDialog(null, "Error");

        }

 
    
    }
      public List<Customer> list() {
        List<Customer> list =new ArrayList<>();
        
        try{
        String sql= "SELECT * FROM customers";
        PreparedStatement pst = con.prepareStatement(sql);
        ResultSet rs = pst.executeQuery(); 
              
            while(rs.next()){
                Customer customer = new Customer(rs.getString("fName"), rs.getString("lName"), rs.getDate("DOB"), rs.getString("NIC"), rs.getString("mobileNum"));
                list.add(customer);        
            }               
        }catch(Exception e){
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error");       
        }      
    
        return list;        
    
      }
} 


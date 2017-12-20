/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PranDistributor;

import java.sql.*;
import javax.swing.*;

/**
 *
 * @author rakib
 */
class MysqlConnect extends JFrame{
    
    Connection conn = null;
// create database connection
    static Connection ConnectDB() { 
        try{
           Class.forName("com.mysql.jdbc.Driver");// 
           Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:16443/prandistributor","root","");
          // JOptionPane.showMessageDialog(null,"Establish database connection.");
           return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error! Database connection.");
            return null;
        }
        
    }
    
}

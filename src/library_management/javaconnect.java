/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package library_management;

import com.mysql.jdbc.Connection;
import java.awt.Toolkit;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Nahid Aslam 12
 */
public class javaconnect {
    
      static Connection conn;
      static ResultSet res ;  
  
      public static Connection connectDb(){
        try
        {
     
       String url ="jdbc:mysql://localhost:3306/librarynew";
       String username ="root";
       String password = "asdx1234";
       Class.forName("com.mysql.jdbc.Driver");
       conn = (Connection) DriverManager.getConnection(url,username,password);
        return conn; 
        
      
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
        
      }
       

}

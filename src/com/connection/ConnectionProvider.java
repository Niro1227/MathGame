/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.connection;

import java.sql.Connection;
import java.sql.DriverManager;



/**
 *
 * @author HP
 */
public class ConnectionProvider {
    
    public static Connection getConn(){
        
        try{
            
            String url = "jdbc:mysql://localhost:3306/user1";
            String uname = "root";
            String password = "1234";
            
            
            Connection con1 = DriverManager.getConnection(url,uname,password);
            
            return con1;
            
            
        }
        
        catch(Exception e)
        {
            
         return null;   
        }
        
    }
    
    
    
}

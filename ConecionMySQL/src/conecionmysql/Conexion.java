/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package conecionmysql;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author alumno04
 */
public class Conexion {
    
    public static Connection conectar()
    {
       Connection connection=null;
       
        try {
           Class.forName("com.mysql.jdbc.Driver");
           connection=DriverManager.getConnection("jdbc:mysql://localhost/test","root","admin");
        } catch (Exception e) {
            e.printStackTrace();
            
        }finally{
        
        
        }
       return connection;
        
    }
    
    
}
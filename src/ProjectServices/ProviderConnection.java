


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProjectServices;
import java.sql.*;
/**
 *
 * @author HP
 */
public class ProviderConnection {
 
    public static Connection getConnect(){
        
        
        try{
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection connect=DriverManager.getConnection("jdbc:mysql://localhost:3306/lmo?useSSL=false","root","pass123");
         
            return connect; 
            
        }catch(Exception e){
        
            System.out.println("ProjectServices.ProviderConnection.getConnection()"+e.toString());
            return null;
        
        }
        
    }
}

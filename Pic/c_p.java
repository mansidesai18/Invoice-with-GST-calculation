/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pic;
import java.sql.*;
/**
 *
 * @author pc
 */
public class c_p {
    public static Connection getCon()
    {
        try
        {
         Class.forName("java.sql.DriverManager");
         Connection con=DriverManager.getConnection( "jdbc:mysql://localhost:3306/bs","root","1234");
         return con;
       
        }
        catch(Exception e)
        {
            return null;
        }
    }
}

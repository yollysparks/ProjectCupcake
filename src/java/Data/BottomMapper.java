/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.Bottom;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author felesiah
 */
public class BottomMapper {
    private final Connection con;
    
    
      public BottomMapper(){
   con = new DB().getConnection();
        // the connection will be released upon program 
        // termination by the garbage collector	
    }
    
    public Bottom getName(String name){
        ResultSet rs = null;
        Statement stmt = null;
        Bottom bottom = null;
        String SQLString = 
                "select * "
                + "from bottoms"
                + "where name = ?" + name;          
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQLString);

            if (rs.next()) {
                 bottom= new Bottom(name,
                        rs.getDouble(2));
                        
            }
        } catch (SQLException e) {
            System.out.println("Fail in BottomMapper - getBottomByName");
            System.out.println(e.getMessage());
        }       
        return bottom;
    }
public Bottom getBottomByPrice(double price){
        ResultSet rs = null;
        Statement stmt = null;
        Bottom Price = null;
        String SQLString
                = "select * "
                + "from bottoms "
                + "where price = ?"+ price;
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQLString);

            if (rs.next()) {
                  Price= new Bottom(rs.getString(3), price);
                        
                          }
        } catch (SQLException e) {
            System.out.println("Fail in BottomMapper - getBottomByPrice");
            System.out.println(e.getMessage());
        }       
        return Price;
    }   
}

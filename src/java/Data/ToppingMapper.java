/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.Topping;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author felesiah
 */
public class ToppingMapper {
     private final Connection con;
    
    
      public ToppingMapper(){
   con = new DB().getConnection();
        // the connection will be released upon program 
        // termination by the garbage collector	
    }
    
    public Topping getName(String name){
        ResultSet rs = null;
        Statement stmt = null;
        Topping topping = null;
        String SQLString = 
                "select * "
                + "from toppings"
                + "where name = ?" + name;          
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQLString);

            if (rs.next()) {
                 topping= new Topping(name,
                        rs.getDouble(2));
                        
            }
        } catch (SQLException e) {
            System.out.println("Fail in ToppingMapper - getToppingByName");
            System.out.println(e.getMessage());
        }       
        return topping;
    }
public Topping getToppingByPrice(double price){
        ResultSet rs = null;
        Statement stmt = null;
        Topping Price = null;
        String SQLString
                = "select * "
                + "from toppings "
                + "where price = ?"+ price;
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQLString);

            if (rs.next()) {
                  Price= new Topping(rs.getString(3), price);
                        
                          }
        } catch (SQLException e) {
            System.out.println("Fail in ToppingMapper - getToppingByPrice");
            System.out.println(e.getMessage());
        }       
        return Price;
    }   
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.Order;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author felesiah
 */
public class OrderMapper {
    private final Connection con;
    
    
    public OrderMapper(){
   con = new DB().getConnection();
        // the connection will be released upon program 
        // termination by the garbage collector	
    }
    
    public Order getOrderId(int id){
        ResultSet rs = null;
        Statement stmt = null;
        Order order = null;
        String SQLString = 
                "select * "
                + "from orders "
                + "where orderId = ?" + id;          
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQLString);

            if (rs.next()) {
                 order = new Order(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getDouble(6));
            }
        } catch (SQLException e) {
            System.out.println("Fail in OrderMapper - getOrderId");
            System.out.println(e.getMessage());
        }       
        return order;
    }
public Order getOrderByUserName(String name){
        ResultSet rs = null;
        Statement stmt = null;
        Order Name = null;
        String SQLString
                = "select * "
                + "from orders "
                + "where user_name = ?";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQLString);

            if (rs.next()) {
                 Name= new Order(rs.getInt(1),
                        name,
                        rs.getString(3),
                        rs.getDouble(4),
                        rs.getString(5),
                        rs.getDouble(6));
            }
        } catch (SQLException e) {
            System.out.println("Fail in OrderMapper - getOrderByUserName");
            System.out.println(e.getMessage());
        }       
        return Name;
    }   
    
}

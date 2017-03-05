/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.User;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author felesiah
 */
public class UserMapper {
    
    private Connection con;
      
    public UserMapper(){
   con = new DB().getConnection();
        // the connection will be released upon program 
        // termination by the garbage collector	
    }
    
    public User getName(){
        ResultSet rs = null;
        Statement stmt = null;
        User user = null;
        String SQLString = 
                "select * "
                + "from user where name = ?";          
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQLString);

            if (rs.next()) {
                 user = new User(rs.getString(1),
                        rs.getString(2),
                        rs.getDouble(3));
            }
        } catch (SQLException e) {
            System.out.println("Fail in UserMapper - getName");
            System.out.println(e.getMessage());
        }       
        return user;
    }
public User getUserByPassword(String password){
        ResultSet rs = null;
        Statement stmt = null;
        User user = null;
        String SQLString
                = "select * "
                + "from user "
                + "where password = ?";
        try {
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQLString);

            if (rs.next()) {
                 user = new User(rs.getString(2), password,rs.getDouble(3));
            }
        } catch (SQLException e) {
            System.out.println("Fail in UserMapper - getUserByPassword");
            System.out.println(e.getMessage());
        }       
        return user;
    }   

}

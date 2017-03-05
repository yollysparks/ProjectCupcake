/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import Model.User;
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
    
    public User getName() throws ClassNotFoundException, SQLException{
        ResultSet rs = null;
        Statement stmt = null;
        User user = null;
        String SQLString = 
                "select * "
                + "from user where name = ?";          
        try {
            Class.forName("com.mysql.jdbc.Driver");
            stmt = con.createStatement();
            rs = stmt.executeQuery(SQLString);
while(rs.next()){
         //Retrieve by column name
         String Name = rs.getString("name");
         String pswd = rs.getString("password");
         double bal = rs.getDouble("balance");
        
            System.out.println("Fail in UserMapper - getName");
            System.out.print(", name: " + Name);
            System.out.print(", employee pswd : " +pswd );
            System.out.println(", balance : "+ bal);
       }
         //STEP 6: Clean-up environment
        rs.close();
        stmt.close();
        con.close();
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
       if(stmt!=null)
           stmt.close();
       if(con!=null)
           con.close();
   }//end try
        return null;
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

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contoller;

/**
 *
 * @author felesiah
 */
import Data.UserMapper;
import Model.User;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author felesiah
 */
// testing my connection to my database
 public class DatabaseConnect {
    
// JDBC driver name and database URL
   static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";  
   static final String DB_URL = "jdbc:mysql://localhost:3306/cupcakes?useSSL=false";

   //  Database credentials
   static final String USER = "root";
   static final String PASS = "indeche2013";
   
   public static void main(String[] args) throws SQLException, ClassNotFoundException{
   Connection conn = null;
   Statement stmt = null;
   try{
      //STEP 2: Register JDBC driver
      Class.forName("com.mysql.jdbc.Driver");

      //STEP 3: Open a connection
      System.out.println("Connecting to database...");
      conn = (Connection)DriverManager.getConnection(DB_URL,USER,PASS);

      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      stmt = (Statement) conn.createStatement();
      String sql;
      sql = "SELECT * FROM user ORDER BY name";
      ResultSet rs = stmt.executeQuery(sql);

      //STEP 5: Extract data from result set
      while(rs.next()){
         //Retrieve by column name
         String Name = rs.getString("name");
        // String Job = rs.getString("JOB");
         String pswd = rs.getString("password");
         double bal = rs.getDouble("balance");

         //Display values
         System.out.print(",employee name: " + Name);
         System.out.print(", employee pswd : " +pswd );
          System.out.println(", balance : "+ bal);
      }
      
      //STEP 6: Clean-up environment
        rs.close();
        stmt.close();
        conn.close();
   }catch(SQLException se){
      //Handle errors for JDBC
      se.printStackTrace();
   }catch(Exception e){
      //Handle errors for Class.forName
      e.printStackTrace();
   }finally{
       if(stmt!=null)
           stmt.close();
       if(conn!=null)
           conn.close();
   }//end try
   System.out.println("Goodbye!");
   
  UserMapper usermapper = new UserMapper();
    
        User user = usermapper.getName();
        System.out.println(user.getName());
        
//        Author isbn= authorMapper.getAuthorByISBN(1200);
//        System.out.println(isbn);
//        
//        Author heading = authorMapper.getTitle("heading");
//        System.out.println("The Darkest Frost"+ heading);
      
   
     }//main
    }  

//stmt.executeUpdate ("INSERT INTO COFFEES " +"VALUES('Amaretto', 49, 9.99, 0, 0)");
   

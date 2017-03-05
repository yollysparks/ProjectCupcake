/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author felesiah
 */
public class DB {
     private Connection con;
    private static DB instance;
    private static PreparedStatement stmt;
    private static String driver = "com.mysql.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3306/cupcakes?useSSL=false";
    private static String id = "root";
    private static String pw = "indeche2013";

    public Connection getConnection() {
        Connection con = null;
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(URL, id, pw);  

        } catch (Exception e) {
            System.out.println("\n*** Remember to insert your  ID and PW in the DBConnector class! ***\n");
            System.out.println("error in DBConnector.getConnection()");
            System.out.println(e);
        }
        return con;
    }

    public void releaseConnection(Connection con) {
        try {
            con.close();
        } catch (Exception e) {
            System.err.println(e);
        }
    }
    
}

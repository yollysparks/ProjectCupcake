/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author felesiah
 */
public class User {
    private String name;
    private String password;
    private double balance;

    public User(String name, String password, double aDouble) {
        this.name = name;
        this.password =password;
        this.balance = balance;
    } 
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param user the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the balance
     */
    public double getBalance() {
        return balance;
    }

    /**
     * @param balance the balance to set
     */
    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void add(String username, String password) {
       String user = username +"-"+ password ; 
    }
    
}

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
public class Order {
    private int order_id;
    private String user_name;
    private String topping_name;
    private double topping_price;
    private String bottom_name;
    private double bottom_price;

    public Order(int order_id, String user_name, String topping_name, double topping_price, String bottom_name, double bottom_price) {
        this.order_id = order_id;
        this.user_name = user_name;
        this.topping_name = topping_name;
        this.topping_price = topping_price;
        this.bottom_name = bottom_name;
        this.bottom_price = bottom_price;
    }

    
    
    
    /**
     * @return the order_id
     */
    public int getOrder_id() {
        return order_id;
    }

    /**
     * @param order_id the order_id to set
     */
    public void setOrder_id(int order_id) {
        this.order_id = order_id;
    }

    /**
     * @return the user_name
     */
    public String getUser_name() {
        return user_name;
    }

    /**
     * @param user_name the user_name to set
     */
    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    /**
     * @return the topping_name
     */
    public String getTopping_name() {
        return topping_name;
    }

    /**
     * @param topping_name the topping_name to set
     */
    public void setTopping_name(String topping_name) {
        this.topping_name = topping_name;
    }

    /**
     * @return the topping_price
     */
    public double getTopping_price() {
        return topping_price;
    }

    /**
     * @param topping_price the topping_price to set
     */
    public void setTopping_price(int topping_price) {
        this.topping_price = topping_price;
    }

    /**
     * @return the bottom_name
     */
    public String getBottom_name() {
        return bottom_name;
    }

    /**
     * @param bottom_name the bottom_name to set
     */
    public void setBottom_name(String bottom_name) {
        this.bottom_name = bottom_name;
    }

    /**
     * @return the bottom_price
     */
    public double getBottom_price() {
        return bottom_price;
    }

    /**
     * @param bottom_price the bottom_price to set
     */
    public void setBottom_price(int bottom_price) {
        this.bottom_price = bottom_price;
    }

    public void add(String topping, String bottom) {
       String name = bottom +"-"+topping ; 
    }
    
}

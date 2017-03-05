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
public class Receipt {
    private int receipt_no;
    private int order_no;
    private String name;
    private int toppings_price;
    private int bottomsPrice;
    private int total;

    /**
     * @return the receipt_no
     */
    public int getReceipt_no() {
        return receipt_no;
    }

    /**
     * @param receipt_no the receipt_no to set
     */
    public void setReceipt_no(int receipt_no) {
        this.receipt_no = receipt_no;
    }

    /**
     * @return the order_no
     */
    public int getOrder_no() {
        return order_no;
    }

    /**
     * @param order_no the order_no to set
     */
    public void setOrder_no(int order_no) {
        this.order_no = order_no;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the toppings_price
     */
    public int getToppings_price() {
        return toppings_price;
    }

    /**
     * @param toppings_price the toppings_price to set
     */
    public void setToppings_price(int toppings_price) {
        this.toppings_price = toppings_price;
    }

    /**
     * @return the bottomsPrice
     */
    public int getBottomsPrice() {
        return bottomsPrice;
    }

    /**
     * @param bottomsPrice the bottomsPrice to set
     */
    public void setBottomsPrice(int bottomsPrice) {
        this.bottomsPrice = bottomsPrice;
    }

    /**
     * @return the total
     */
    public int getTotal() {
        return total;
    }

    /**
     * @param total the total to set
     */
    public void setTotal(int total) {
        this.total = total;
    }
}

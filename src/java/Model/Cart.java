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
public class Cart {
    private Topping topping;
    private Bottom bottom;
    private int number;    

    public Topping getTopping() {
        return topping;
    }

    public void setTopping( Topping topping ) {
        this.topping = topping;
    }

    public Bottom getBottom() {
        return bottom;
    }

    public void setBottom( Bottom bottom ) {
        this.bottom = bottom;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber( int number ) {
        this.number = number;
    } 
}

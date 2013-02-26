/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcl.discountstratgey;

/**
 *
 * @author tim78317
 */
public interface DiscountStrategy {

   public abstract double getDiscount(double price, int qty);

    public abstract double getDiscountRate();

    public abstract void setDiscountRate();
    
}

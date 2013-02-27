
package tcl.discountstratgey;

/**
 *
 * @author tim78317
 */
public interface DiscountStrategy {

   public abstract double getDiscountAmt(double price, int qty);

    public abstract double getDiscountRate();

    public abstract void setDiscountRate();
    
}

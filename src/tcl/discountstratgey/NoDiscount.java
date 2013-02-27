
package tcl.discountstratgey;

/**
 *
 * @author tim78317
 */
public class NoDiscount implements DiscountStrategy {

    @Override
    public double getDiscountAmt(double price, int qty) {
        return 0;
    }

    @Override
    public double getDiscountRate() {
        return 0;
    }

    @Override
    public void setDiscountRate() {
        // do nothing
    }
    
}

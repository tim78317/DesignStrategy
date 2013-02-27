package tcl.discountstratgey;

/**
 *
 * @author tim78317
 */
public class FlatRateDiscount implements DiscountStrategy {
    private double discountRate = .10;

    public FlatRateDiscount(double discountRate) {
        this.discountRate = discountRate;
    }
    
    @Override
    public double getDiscountAmt(double price, int qty) {
        return price * qty * discountRate;
    }

    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void setDiscountRate() {
        
    }
  
    public static void main(String[] args) {
        
        DiscountStrategy discount= new FlatRateDiscount(.10);
        double amt = discount.getDiscountAmt(8, 2);
        
        System.out.println(amt);
    }
  
}
 

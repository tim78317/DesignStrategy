package tcl.discountstratgey;

/**
 *
 * @author tim78317
 */
public class FlatRateDiscount implements DiscountStrategy {
    private double discountrate =.10;

    
    
   
   

    @Override
    public double getDiscount(double price, int qty) {
        return price * qty * discountrate;
    }

    @Override
    public double getDiscountRate() {
        return discountrate;
    }

    @Override
    public void setDiscountRate() {
        
    }
  
    public static void main(String[] args) {
        
        DiscountStrategy discount= new FlatRateDiscount();
        double amt = discount.getDiscount(8, 2);
        
        System.out.println(amt);
    }
  
}
 

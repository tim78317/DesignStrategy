
package tcl.discountstratgey;

/**
 *
 * @author tim78317
 */
public class QtyDiscount implements DiscountStrategy{
    private double discountrate = .10; 
    private int minqty = 5;

    
    
   public QtyDiscount(int qty){
       
   }
    
    public int getMinqty() {
        return minqty;
    }

    public void setMinqty() {
        
    }

    @Override
    public double getDiscount(double price, int qty) {
         
        if (qty > minqty && qty < 100){
                    return price * qty * discountrate;

        }else{
        
                return 0;
    
                  
    }
                
    }

    @Override
    public double getDiscountRate() {
      return discountrate;
    }

    @Override
    public void setDiscountRate() {
        
    }


 
    public static void main(String[] args) {
        DiscountStrategy discount = new QtyDiscount(8);
        double amt = discount.getDiscount(10,5);
        System.out.println(amt);
    }
}

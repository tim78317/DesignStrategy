package tcl.discountstratgey;

/**
 *
 * @author tim78317
 */
public class QtyDiscount implements DiscountStrategy {
    private double discountRate = .10;
    private int minQty = 5;

    public QtyDiscount(double discountRate, int minQty) {
        this.discountRate = discountRate;
        this.minQty = minQty;
    }

    public int getMinQty() {
        return minQty;
    }

    public void setMinQty() {
    }

    @Override
    public double getDiscountAmt(double price, int qty) {

        if (qty >= minQty) {
            return price * qty * discountRate;
        } else {
            return 0;
        }

    }

    @Override
    public double getDiscountRate() {
        return discountRate;
    }

    @Override
    public void setDiscountRate() {
    }

    public static void main(String[] args) {
        DiscountStrategy discount = new QtyDiscount(.10,5);
        double amt = discount.getDiscountAmt(10, 5);
        System.out.println(amt);
    }
}

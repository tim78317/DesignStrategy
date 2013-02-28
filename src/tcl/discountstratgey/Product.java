
package tcl.discountstratgey;

/**
 *
 * @author tim78317
 */
public class Product {
    private String productName;
    private String productId;
    private double unitCost;
    private DiscountStrategy discount; 
    
    
    
    public Product(String id, String name, double cost, DiscountStrategy discount){
        productName= name; 
        productId = id;
        unitCost = cost;
        this.discount = discount; 
        
    }
    
    
    
    public double getProductDiscountAmt(int qty){
        return discount.getDiscountAmt(unitCost, qty);
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public double getUnitCost() {
        return unitCost;
    }

    public void setUnitCost(double unitCost) {
        this.unitCost = unitCost;
    }

    public DiscountStrategy getDiscount() {
        return discount;
    }

    public void setDiscount(DiscountStrategy discount) {
        this.discount = discount;
    }

    public static void main(String[] args) {
        Product product = new Product("hat", "12340", 10.00, new FlatRateDiscount(.10));
        double amt = product.getProductDiscountAmt(2);
        
        System.out.println(amt);
    }
}

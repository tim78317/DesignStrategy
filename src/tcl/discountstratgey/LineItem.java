package tcl.discountstratgey;

/**
 *
 * @author tim78317
 */
public class LineItem {

    private int qty;
    private Product product;
   
    public LineItem(String prodId, int qty) {
        this.qty = qty;
        // find product
        FakeDatabase db = new FakeDatabase();
        product = db.findProduct(prodId);
    
    
    
    }

   

    public double getProductPrice() {
        return product.getUnitCost();
    }

    public double getProductDiscountAmt() {
        return product.getProductDiscountAmt(qty);
    }
    
    
     public double getSubTotal() {
        return qty * product.getUnitCost();
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public static void main(String[] args) { 
       LineItem line = new LineItem("B205", 6);
       
       String s = "Product ID: ";
       s+= line.product.getProductId();
       s+= " Product Description: ";
       s+= line.product.getProductName();
       // s = s + line.getQty()
        s += line.getQty();
        s += " Cost: $";
        s += line.product.getUnitCost();
        s+= " Total: $";
        s+= line.getSubTotal();
        s+= " Discount saved: $";
        s+=line.getProductDiscountAmt();
        System.out.println(s);
       
        
       
        
    }
}

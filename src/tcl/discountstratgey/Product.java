/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tcl.discountstratgey;

/**
 *
 * @author tim78317
 */
public class Product {
    private String productname;
    private String productid;
    private double productdiscount;
    private DiscountStrategy discount; 
    
    
    
    public Product(String name, String number, DiscountStrategy discount){
        productname= name; 
        productid = number;
        this.discount = discount; 
        
    }
    
    public double getProductDiscount(){
        return productdiscount =  discount.getDiscount(10, 2);
    }

    public String getProductname() {
        return productname;
    }

    public void setProductname(String productname) {
        this.productname = productname;
    }

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public static void main(String[] args) {
        Product product = new Product("hat", "12340", new FlatRateDiscount());
        double amt = product.getProductDiscount();
        
        System.out.println(amt);
    }
}

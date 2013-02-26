
package tcl.discountstratgey;

/**
 *
 * @author tim78317
 */
public class Receipt {
    private LineItem[] lineitem;
    private Customer customer;
    

    public LineItem[] getLineitem() {
        return lineitem;
    }

    public void setLineitem(LineItem[] lineitem) {
        this.lineitem = lineitem;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    public double getTotal(){
        return 0;
    }
    
    public double getSavings(){
        return 0;
    }
    
    
    
    
    
}

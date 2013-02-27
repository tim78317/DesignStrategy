
package tcl.discountstratgey;

/**
 *
 * @author tim78317
 */
public class Receipt {
    private LineItem[] lineItems;
    private Customer customer;
    
    
    public void addLineItem(Product product, int qty) {
        //LineItem item = new LineItem(product, qty);
        //addToArray(item);
    }
 private void addToArray(LineItem item) {
        LineItem[] tempItems = new LineItem[lineItems.length + 1];
        System.arraycopy(lineItems, 0, tempItems, 0, lineItems.length);
        tempItems[lineItems.length] = item;
        lineItems = tempItems;
    }
 
  public double getTotalBeforeDiscount() {
        double grandTotal = 0.0;
        for(LineItem item : lineItems) {
            grandTotal += item.getSubTotal();
        }
        return grandTotal;
    }

    public void setLineitem(LineItem[] lineItems) {
        this.lineItems = lineItems;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
    
    
}


package tcl.discountstratgey;

/**
 *
 * @author tim78317
 */
public class LineItem {
    private String productid;
    private LineItem [] lineitem;
    private Product product; 
    
    

    public String getProductid() {
        return productid;
    }

    public void setProductid(String productid) {
        this.productid = productid;
    }

    public LineItem[] getLineitem() {
        return lineitem;
    }

    public void setLineitem(LineItem[] lineitem) {
        this.lineitem = lineitem;
    }
    
}

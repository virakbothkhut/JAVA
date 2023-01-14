
package firstjavaform;
public class ProductInfo {
   
    private String Code, Name;
    private double Price;
    
    public ProductInfo(){
        this.Code = null;
        this.Name = null;
        this.Price = 0;   
    }
    
    public ProductInfo(String Code, String Name, double Price) {
        this.Code = Code;
        this.Name = Name;
        this.Price = Price;
    }
    
    public String getCode() {return this.Code;}
    public String getName() {return this.Name;}
    public double getPrice() {return this.Price;}
}

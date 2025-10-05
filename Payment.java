
package couriermanagementsystem;


public class Payment {
    private String paymentID;
    private String paymentType;
    private double totalPayment;
    double totalWeightPrice;
    double totalDestination;
    
    public Payment(){
        paymentID = "P1111";
    }
  
    public Payment(String ID, String type, double totalWeightPrice, double totalDestination) {
        this.paymentID = ID;
        this.paymentType = type;
        this.totalWeightPrice = totalWeightPrice;
        this.totalDestination = totalDestination;
        
    }
    
    public String getPaymentID() {
        return paymentID;
    }
    
    public void setPaymentID(String ID) {
        this.paymentID = ID;
    }
    
    public String getPaymentType() {
        return paymentType;
    }
    
    public void setPaymentType(String type) {
        this.paymentType = type;
    }
    
    public void setweightPrice(double totalWeightPrice) {
        this.totalWeightPrice = totalWeightPrice;
    }
    public double getweightPrice() {
        return totalWeightPrice;
    }
    public void setdestinationPrice(double totalDestination) {
        this.totalDestination = totalDestination;
    }
    public double getdestinationPrice() {
        return totalDestination;
    }
    public double getTotalPayment() {
        return totalPayment;
    }
    
    public void setTotalPayment(double totalWeightPrice, double totalDestination){
        
        totalPayment= totalWeightPrice + totalDestination;
    }
    
}


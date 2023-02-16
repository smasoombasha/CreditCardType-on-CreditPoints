package feb15Day12.Challenge2;

public class Customer {
    private String customerName;
    private int creditPoints;
    Customer(String customerName, int creditPoints){
        this.customerName= customerName;
        this.creditPoints=creditPoints;
    }
    public int getCreditPoints(){
        return creditPoints;
    }
    /*public String getCustomerName(){
        return getCustomerName();
    }*/

    @Override
    public String toString() {
        return "Customer{" +
                "customerName='" + customerName + '\'' +
                '}';
    }
}

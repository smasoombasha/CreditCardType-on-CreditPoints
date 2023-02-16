package feb15Day12.Challenge2;

public class CardType {
    private Customer customer;
    private String cardType;
    CardType(Customer customer,String cardType ){
        this.customer=customer;
        this.cardType=cardType;
    }
    public String toString(){
        return "The Customer '"+customer+"' Is Eligible for '"+cardType+"' Card.";
    }
}

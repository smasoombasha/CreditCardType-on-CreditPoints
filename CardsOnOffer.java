package feb15Day12.Challenge2;

public class CardsOnOffer {
    public static CardType getOfferedCard(Customer customer){
        int creditScore = customer.getCreditPoints();
        String cardType;
        if(creditScore<100) cardType= "EMI";
        else if(creditScore<501) cardType="silver";
        else if(creditScore<1001) cardType="Gold";
        else cardType  ="Platinum";
        return new CardType(customer, cardType);
    }
}

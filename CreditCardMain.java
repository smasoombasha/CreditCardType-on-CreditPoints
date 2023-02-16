package feb15Day12.Challenge2;

public class CreditCardMain {
    public static void main(String... a){
        Customer cc = new Customer("Masoom",600);// initializing instances
       // System.out.println(cc);
       // CardsOnOffer co =new CardsOnOffer();
        //CardType cardType = co.getOfferedCard(cc);
        // CardsOnOffer class have static method hence no need object
        CardType cardType = CardsOnOffer.getOfferedCard(cc);//calling getOfferedCard() of CardsOnOffer
        // and it returns obj (new CardType(customer, cardType);) of Card type.
        System.out.println(cardType);
    }
}

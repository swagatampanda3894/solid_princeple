package DIP;

/*here it is loose coupling not dependent with each other *****/
public class ShoppingMall {

    private  CardType cardType;

    public ShoppingMall(CardType cardType) {
        this.cardType = cardType;
    }

    public  void doPerchaseSomething(long amount){
          cardType.doTransaction(amount);
    }

    public static void main(String[] args) {

        CardType debitCardTypes= new DebitCard();
        CardType creditCardTypes= new CreditCard();

        ShoppingMall shoppingMall = new ShoppingMall(debitCardTypes);
        shoppingMall.doPerchaseSomething(5000);

    }
}

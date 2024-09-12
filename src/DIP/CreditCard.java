package DIP;

public class CreditCard implements CardType{
    @Override
    public void doTransaction(long amount) {
       System.out.println("do credit card transaction: "+ amount);
    }
}

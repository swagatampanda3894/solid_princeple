package DIP;

public class DebitCard implements CardType{


    @Override
    public void doTransaction(long amount) {
        System.out.println("do debit card transaction: "+ amount);
    }
}

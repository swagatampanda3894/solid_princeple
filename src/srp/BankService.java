package srp;

public class BankService {
    //Here in bank service we have all the methods of bank related work.
    // in future  if the new loan coming so adding in single instead we need to do individually

    public  void  getLoan(String loan){
        if(loan.equalsIgnoreCase("HomeLoan")){
            // go for home loan
        } else  if(loan.equalsIgnoreCase("CarLoan")){
            //go for car loan
        }
    }
    public  void printerPassbook(String passbookData){
        // print pass book data
    }
    public  void sendNotification(String medium){
        if(medium.equalsIgnoreCase("email")){
            // go for email integration
        } else if(medium.equalsIgnoreCase("phone")){
            // go for otp service
        }
    }
}

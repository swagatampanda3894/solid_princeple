package srp;

public class NotificationService {

    public String medium(String medium) {
        String path = "none";
        if (medium.equalsIgnoreCase("email")) {
            // go for email integration
        } else if (medium.equalsIgnoreCase("phone")) {
            // go for otp service
        }
        return medium;
    }
}

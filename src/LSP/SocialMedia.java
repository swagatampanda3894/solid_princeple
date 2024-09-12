package LSP;

public abstract class SocialMedia {

    //Support facebook,wp,telegram chat
    public abstract void  chatWithFriend();


    //Support facebook and instagram
    public abstract void post(Object object);


    //Support whatsapp,facebook,instagram
    public abstract void sendPhotosAndVideos();

    //Support wp and fb
    public abstract void  groupCall(String... users);


}

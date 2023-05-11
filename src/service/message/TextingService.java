package service.message;

//Client class that has a MessageService dependency
public class TextingService {

    //The dependency, this time it is swappable with any MessageService implementation
    private MessageService messageService;

    //Instead of the TextService handling the creation and management of the
    //MessageService, it is passed in by some other place or system. It's "injected"
    //into the constructor. The control is being inverted from this class to another
    //place or system outside of the class.
    public TextingService(MessageService messageService) {
        this.messageService = messageService;
    }

    //Use the service without worrying about which implementation it is
    public void respondToText(){
        System.out.println(this.messageService.getMessage());
    }

}




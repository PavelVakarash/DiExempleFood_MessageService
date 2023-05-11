package service.message;

//Concrete dependency implementation of MessageService interface
public class EnglishMessageService implements MessageService {
    @Override
    public String getMessage() {
        return "Hello";
    }
}


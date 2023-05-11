package service.message;

//Concrete dependency implementation of MessageService interface
public class SpanishMessageService implements MessageService {
    @Override
    public String getMessage() {
        return "Hola";
    }
}

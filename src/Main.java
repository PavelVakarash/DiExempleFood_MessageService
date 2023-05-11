import service.food.RestaurantService;
import service.message.EnglishMessageService;
import service.message.MessageService;
import service.message.SpanishMessageService;
import service.message.TextingService;

public class Main {

    public static void main(String[] args) {

        //No dependency injection is used here, the FoodService is made within the RestaurantService
        RestaurantService restaurantService = new RestaurantService();
        restaurantService.processOrder();

        System.out.println("**************************");

        SpanishMessageService spanishMessageService = new SpanishMessageService();
        TextingService textingService = new TextingService(spanishMessageService);
        textingService.respondToText();

        System.out.println("**************************");

        EnglishMessageService englishMessageService = new EnglishMessageService();
        TextingService textingService2 = new TextingService(englishMessageService);
        textingService2.respondToText();
    }
}


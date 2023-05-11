package service.food;

//A client service that has a dependency
public class RestaurantService {

    //A dependency
    private FoodService foodService;

    //The client and the dependency are tightly coupled and
    //the client has the responsibility of creating and providing
    //the dependency. This is bad from a design perspective.
    public RestaurantService(){
        foodService = new FoodService();
    }

    public void processOrder(){
        System.out.println("New order started.");
        foodService.cookFood();
    }

}


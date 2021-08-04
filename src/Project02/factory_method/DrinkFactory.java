package Project02.factory_method;

public class DrinkFactory extends Factory {
    @Override
    protected Product createProduct(String name,Integer price) {
        return new Drink(name,price);
    }

}

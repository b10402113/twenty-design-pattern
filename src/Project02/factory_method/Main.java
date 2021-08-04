package Project02.factory_method;

public class Main {
    public static void main(String[] args) {
        Factory drinkFactory = new DrinkFactory();
        Product drink1 = drinkFactory.create("雀巢檸檬茶", 30);
        Product drink2 = drinkFactory.create("魔爪", 40);
        Product drink3 = drinkFactory.create("咖啡", 50);
        drink1.showInfo();
        drink2.showInfo();
        drink3.showInfo();
    }
}

package Project02.factory_method;

public class Drink extends Product{
    private String name;
    private Integer price;
    Drink(String name,Integer price){
        this.name = name;
        this.price = price;
    }

    @Override
    public void showInfo() {
        System.out.println("這杯"+name+"價值："+price+"元");
    }

}

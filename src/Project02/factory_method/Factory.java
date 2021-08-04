package Project02.factory_method;

public abstract class Factory {
    public final Product create(String name,Integer price){
        Product p = createProduct(name,price);
        return p;
    }
    protected abstract Product createProduct(String name,Integer price);
}

package Project01.Adapter;
// 使用extends
public class PrintDogSound extends DogSound implements Print {
    public PrintDogSound() {
    }

    @Override
    public void printSound() {
        this.bark();
    }
}

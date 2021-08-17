package Project01.Adapter;
// 使用Delegation
public class PrintCatSound implements Print{
    public CatSound catSound;
    public PrintCatSound() {
    }

    @Override
    public void printSound() {
        catSound.meow();
    }
}

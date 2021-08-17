package Project01.Adapter;

public class AdapterTest {
    public static void main(String[] args) {
        Print printCatSound = new PrintCatSound();
        Print printDogSound = new PrintDogSound();
        printCatSound.printSound();
        printDogSound.printSound();
    }
}

package Project01.Adapter;

public class AdapterTest {
    public static void main(String[] args) {
        Print printRapperRespect = new PrintRapperRespect("Andy");
        printRapperRespect.printNoRespect();
        printRapperRespect.printRespect();
    }
}

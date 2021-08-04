package Project01.Adapter;

public class PrintRapperRespect extends RapperRespect implements Print{
    public PrintRapperRespect(String name) {
        super(name);
    }

    @Override
    public void printRespect() {
        showWithRespect();
    }

    @Override
    public void printNoRespect() {
        showWithoutRespect();
    }

    public void showMeMoney(){
        System.out.println("欸，給我一點錢拉。");
    }
}

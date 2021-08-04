package Project01.Adapter;

public class RapperRespect extends Respect{
    private String name;
    public RapperRespect(String name){
        this.name = name;
    };
    public void showWithRespect(){
        System.out.println("欸，"+this.name+"，你rap飛上天了吧");
    }
    public void showWithoutRespect(){
        System.out.println("欸，"+name+"，你唱得跟雞在叫一樣 = =");
    }

}

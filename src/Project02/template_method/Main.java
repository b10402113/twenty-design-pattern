package Project02.template_method;

public class Main {
    public static void main(String[] args) {
        AbstractNinja waterMasterNinja = new WaterMasterNinja();
        AbstractNinja sasuke = new FireMasterNinja();
        sasuke.seriesAttack();
        waterMasterNinja.seriesAttack();
    }
}

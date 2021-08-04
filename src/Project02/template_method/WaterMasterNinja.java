package Project02.template_method;

public class WaterMasterNinja extends AbstractNinja {
    @Override
    public void physicalAttack() {
        System.out.println("忍術，多重連彈打擊");
    }

    @Override
    public void magicAttack() {
        System.out.println("水遁，水龍鞭");
    }
}

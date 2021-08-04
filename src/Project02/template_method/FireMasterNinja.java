package Project02.template_method;

public class FireMasterNinja extends AbstractNinja{
    @Override
    public void physicalAttack() {
        System.out.println("忍術，獅子連彈");
    }


    @Override
    public void magicAttack() {
        System.out.println("火遁，豪火球之術");
    }
}

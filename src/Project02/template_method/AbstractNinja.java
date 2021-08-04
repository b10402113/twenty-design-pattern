package Project02.template_method;

public  abstract class AbstractNinja {

    public abstract void physicalAttack();

    public abstract void magicAttack();

    public final void runaway(){
        System.out.println("快速逃跑");
    }

    public final void seriesAttack(){
        physicalAttack();
        magicAttack();
        physicalAttack();
        runaway();
    }


}

package designpattern.decorator;

/**
 * DATE  2019-08-29
 * 鸡蛋装饰器，继承抽象装饰类（AbstractDecorator）
 *
 *
 */
public class EggDecorator extends AbstractDecorator {
    public EggDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected void doSomething() {

    }

    @Override
    protected String getDesc() {
        return super.getDesc() + "加一个鸡蛋,";
    }

    @Override
    protected int cost() {
        return super.cost() + 1;
    }

    public void egg() {
        System.out.println("增加一个鸡蛋！");
    }
}

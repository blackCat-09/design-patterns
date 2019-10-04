package designpattern.decorator;

/**
 * DATE  2019-08-29
 * 香肠装饰器，继承抽象装饰类（AbstractDecorator）
 *
 *
 */
public class SausageDecorator extends AbstractDecorator {

    public SausageDecorator(ABattercake aBattercake) {
        super(aBattercake);
    }

    @Override
    protected void doSomething() {

    }


    @Override
    protected String getDesc() {
        return super.getDesc() + "加一根香肠,";
    }

    @Override
    protected int cost() {
        return super.cost() + 2;
    }
}

package designpattern.decorator;

/**
 * DATE  2019-08-29
 * 装饰器模式
 */
public class Main {
    public static void main(String[] args) {
        ABattercake aBattercake = new Battercake();
        System.out.println(aBattercake.getDesc() + "销售价格：" + aBattercake.cost());


        aBattercake = new EggDecorator(aBattercake);
        System.out.println(aBattercake.getDesc() + "销售价格：" + aBattercake.cost());


        aBattercake = new SausageDecorator(aBattercake);
        System.out.println(aBattercake.getDesc() + "销售价格：" + aBattercake.cost());

    }
}

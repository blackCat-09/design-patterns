package designpattern.factoryMethod;

/**
 * DATE  2019-08-19
 * 工厂模式
 *
 */
public class Main {
    public static void main(String[] args) {
        Factory factory = new IDCardFactory();
        Product p1 = factory.create("小明");
        Product p2 = factory.create("小红");
        Product p3 = factory.create("小刚");
        p1.use();
        p2.use();
        p3.use();
    }
}

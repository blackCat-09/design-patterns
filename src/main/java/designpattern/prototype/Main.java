package designpattern.prototype;

/**
 * DATE  2019-08-19
 * 原型模式
 *
 */
public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();

        UndeerlinePen upen = new UndeerlinePen('~');
        MessageBox mbox = new MessageBox('*');
        MessageBox sbox = new MessageBox('/');
        manager.register("strong message", upen);
        manager.register("warning box", mbox);
        manager.register("slash box", sbox);

        // 生成
        manager.create("strong message").use("hello");
        manager.create("warning box").use("hello");
        manager.create("slash box").use("hello");

    }
}

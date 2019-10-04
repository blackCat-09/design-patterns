package designpattern.singleton;

/**
 * DATE  2019-08-19
 * 单例模式
 *
 *
 */
public class Main {

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if (s1 == s2) {
            System.out.println("s1 和 s2 是相同的实例");
        } else {
            System.out.println("s1 和 s2 不是相同的实例");
        }
    }
}

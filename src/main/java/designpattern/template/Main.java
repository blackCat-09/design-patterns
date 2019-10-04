package designpattern.template;

/**
 * DATE  2019-08-19
 * 模板工具类
 *
 */
public class Main {

    public static void main(String[] args) {
        AbstracDisplay d1 = new CharDisplay('H');
        AbstracDisplay d2 = new StringDisplay("Hello world");
        d1.display();
        d2.display();
    }
}

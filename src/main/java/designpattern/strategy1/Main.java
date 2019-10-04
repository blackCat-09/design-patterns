package designpattern.strategy1;

/**
 * DATE  2019-08-31
 * 策略类
 *
 */
public class Main {

    public static void main(String[] args) {
        Shopping shopping1 = new Shopping("书籍-深入理解Java虚拟机", 54.00, new Dis9Discount());
        shopping1.calculate();

        Shopping shopping2 = new Shopping("Apple 妙控鼠标", 588.00, new Dis8Discount());
        shopping2.calculate();

        Shopping shopping3 = new Shopping("戴尔U2417H显示器", 1479.00, new Cash10Discount());
        shopping3.calculate();

    }
}

package designpattern.observer;

/**
 * DATE  2019-08-22
 * 表示以数字形式显示数值的类
 *
 *
 */
public class DigitObserver implements Observer {
    public void update(NumberGenerator generator) {
        System.out.println("DigitObserver" + generator.getNumber());
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

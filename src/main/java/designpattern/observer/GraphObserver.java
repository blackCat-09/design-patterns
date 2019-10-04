package designpattern.observer;

/**
 * DATE  2019-08-22
 * 表示以简单的图示形式显示数值的类
 *
 *
 */
public class GraphObserver implements Observer {
    public void update(NumberGenerator generator) {
        System.out.println("GraphObserver");
        int number = generator.getNumber();
        for (int i = 0; i < number; i++) {
            System.out.print("");
        }
        System.out.println("");
        try {
            Thread.sleep(100);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

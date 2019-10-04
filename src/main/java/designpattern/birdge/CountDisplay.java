package designpattern.birdge;

/**
 * DATE  2019-08-20
 * 类功能层次结构、增加“只显示规定次数”
 *
 *
 */
public class CountDisplay extends Display {
    public CountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void multiDisplay(int times) {
        open();
        for (int i = 0; i < times; i++) {
            print();
        }
        close();
    }
}

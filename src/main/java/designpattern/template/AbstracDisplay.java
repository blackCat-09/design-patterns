package designpattern.template;

/**
 * DATE  2019-08-19
 * 抽象类 AbstractDisplay
 *
 *
 */
public abstract class AbstracDisplay {

    public abstract void open();

    public abstract void print();

    public abstract void close();

    public final void display() {
        open();
        for (int i = 0; i < 5; i++) {
            print();
        }
        close();
    }
}

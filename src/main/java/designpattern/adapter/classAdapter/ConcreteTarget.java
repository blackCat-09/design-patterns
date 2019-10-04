package designpattern.adapter.classAdapter;

/**
 * DATE  2019-08-29
 *
 *
 */
public class ConcreteTarget implements Target {
    public void request() {
        System.out.println("concreteTarget 目标方法");
    }
}

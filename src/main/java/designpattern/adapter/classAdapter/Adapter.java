package designpattern.adapter.classAdapter;

/**
 * DATE  2019-08-29
 * 适配器类，实现 Target 接口，同时继承 Adaptee 类，然后在实现的 request();
 *
 *
 */
public class Adapter extends Adaptee implements Target {
    public void request() {
        super.adapteeRequest();

    }
}

package designpattern.adapter.ObjectAdapter;

import designpattern.adapter.classAdapter.Adaptee;
import designpattern.adapter.classAdapter.Target;

/**
 * DATE  2019-08-29
 * 对象适配器。
 *
 *
 */
public class Adapter implements Target {

    // 适配者是对象适配器的一个属性
    private Adaptee adaptee = new Adaptee();

    public void request() {
        adaptee.adapteeRequest();

    }
}

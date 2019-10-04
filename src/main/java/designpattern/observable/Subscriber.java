package designpattern.observable;

/**
 * DATE  2019-08-31
 * 观察者~定义接口
 *
 */
public interface Subscriber {

    int receive(String publisher, String articleName);

}

package designpattern.observer;

/**
 * DATE  2019-08-22
 * 表示观察者的接口
 *
 */
public interface Observer {

    public abstract void update(NumberGenerator generator);
}

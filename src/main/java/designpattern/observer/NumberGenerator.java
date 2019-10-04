package designpattern.observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * DATE  2019-08-22
 * 表示生成数值的对象的抽象类
 *
 *
 */
public abstract class NumberGenerator {

    private ArrayList observers = new ArrayList();

    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    public void deleteObserver(Observer observer) {
        observers.remove(observer);
    }

    public void notifyObserver() {
        Iterator iterator = observers.iterator();
        while (iterator.hasNext()) {
            Observer observer = (Observer) iterator.next();
            observer.update(this);
        }
    }

    public abstract int getNumber();
    public abstract void execute();
}

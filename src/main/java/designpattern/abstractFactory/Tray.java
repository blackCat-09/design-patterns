package designpattern.abstractFactory;

import java.util.ArrayList;

/**
 * DATE  2019-08-20
 * 抽象的零件 Tray
 */
public abstract class Tray extends Item {

    protected ArrayList tray = new ArrayList();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item) {
        tray.add(item);
    }
}

package designpattern.abstractFactory;

/**
 * DATE  2019-08-20
 * 抽象的零件 Item
 *
 */
public abstract class Item {

    protected String caption;

    public Item(String caption) {
        this.caption = caption;
    }

    public abstract String makeHTML();
}

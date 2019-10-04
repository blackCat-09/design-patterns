package designpattern.abstractFactory;

/**
 * DATE  2019-08-20
 * 抽象的零件 Link 类
 *
 */
public abstract class Link extends Item {

    protected String url;

    public Link(String caption, String url) {
        super(caption);
        this.url = url;
    }
}

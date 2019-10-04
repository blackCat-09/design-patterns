package designpattern.abstractFactory;

import java.util.ArrayList;

/**
 * DATE  2019-08-20
 * 抽象产品类 Page
 *
 */
public abstract class Page {

    protected String titel;
    protected String author;

    protected ArrayList content = new ArrayList();

    public Page(String titel, String author) {
        this.titel = titel;
        this.author = author;
    }

    public void add(Item item) {
        content.add(item);
    }

    public void  output(){
        try {
            String filename = titel + ".html";
        } catch (Exception e) {

        }
    }
}

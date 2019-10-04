package designpattern.template;

/**
 * DATE  2019-08-19
 *
 *
 */
public class CharDisplay extends AbstracDisplay {

    private char ch;

    public CharDisplay(char ch){
        this.ch = ch;
    }

    @Override
    public void open() {
        System.out.print("<<");
    }

    @Override
    public void print() {
        System.out.print(ch);
    }

    @Override
    public void close() {
        System.out.println(">>");
    }
}

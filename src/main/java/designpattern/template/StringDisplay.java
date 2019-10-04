package designpattern.template;

/**
 * DATE  2019-08-19
 * 具体实现
 *
 */
public class StringDisplay extends AbstracDisplay{
    private String string;
    private int width;

    public StringDisplay(String string) {
        this.string = string;
        this.width = string.getBytes().length;
    }

    @Override
    public void open() {
        printLine();
    }

    @Override
    public void print() {
        System.out.println("|" + string + "|");
    }

    @Override
    public void close() {
        printLine();
    }

    private void printLine(){
        System.out.print("+");
        for (int i = 0; i< width; i++){
            System.out.print("-");
        }
        System.out.println("+");
    }
}

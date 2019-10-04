package designpattern.strategy.sort;

/**
 * DATE  2019-08-21
 *
 *
 */
public class Main {

    public static void main(String[] args) {
        String[] data = {"Dumpty", "Bowman", "Carroll", "Elfland", "Alice"};
        SortAndPrint sap = new SortAndPrint(data, new SelectionSorter());
        sap.execute();
    }
}

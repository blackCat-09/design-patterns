package designpattern.strategy1;

/**
 * DATE  2019-08-31
 *
 *
 */
public class Dis9Discount extends Discount {

    public Dis9Discount(){
        super("打9折");
    }

    @Override
    double discount(double price) {
        finalPrice = price * 0.9;
        return finalPrice;
    }
}

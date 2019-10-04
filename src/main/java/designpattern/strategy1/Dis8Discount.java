package designpattern.strategy1;

/**
 * DATE  2019-08-31
 *
 *
 */
public class Dis8Discount extends Discount {

    public Dis8Discount(){
        super("打8折");
    }

    @Override
    double discount(double price) {
        finalPrice = price * 0.8;
        return finalPrice;
    }
}

package designpattern.strategy1;

/**
 * DATE  2019-08-31
 *
 *
 */
public abstract class Discount {

    protected double finalPrice;
    protected String desc;

    public Discount(String desc) {
        this.desc = desc;
    }

    abstract double discount(double price);

    public double getFinalPrice() {

        return finalPrice;
    }

    public void setFinalPrice(double finalPrice) {
        this.finalPrice = finalPrice;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
}

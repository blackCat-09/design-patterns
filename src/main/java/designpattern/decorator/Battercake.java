package designpattern.decorator;

/**
 * DATE  2019-08-29
 * 煎饼类，
 *
 *
 */
public class Battercake extends ABattercake {

    @Override
    protected String getDesc() {
        return "煎饼";
    }

    @Override
    protected int cost() {
        return 8;
    }
}

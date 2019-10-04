package designpattern.strategy;

/**
 * DATE  2019-08-21
 * 猜拳游戏中的策略的类
 *
 */
public interface Strategy {

    public abstract Hand nextHand();

    public abstract void study(boolean win);
}

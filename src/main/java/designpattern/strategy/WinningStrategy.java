package designpattern.strategy;

import java.util.Random;

/**
 * DATE  2019-08-21
 * 表示，“如果这局猜拳获胜，那么下一局也出一样的手势”
 *
 *
 */
public class WinningStrategy implements Strategy {

    private Random random;
    private boolean won = false;
    private Hand prevHand;

    public WinningStrategy(int seed) {
        random = new Random(seed);
    }


    public Hand nextHand() {
        if (!won) {
            prevHand = Hand.getHand(random.nextInt(3));
        }
        return prevHand;
    }

    public void study(boolean win) {
        won = win;
    }
}

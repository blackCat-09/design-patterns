package designpattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * DATE  2019-08-27
 * 表示 Gamer 状态的类
 *
 */
public class Memento {
    // 所持金钱
    int money;
    // 获得的水果
    ArrayList fruits;

    // 获得当前所持的金钱
    public int getMoney(){
        return money;
    }

    Memento(int money){
        this.money = money;
        this.fruits = new ArrayList();
    }

    void addFruit(String fruit){
        fruits.add(fruit);
    }

    List getFruits(){
      return (List) fruits.clone();
    }
}

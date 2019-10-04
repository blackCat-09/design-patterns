package designpattern.factoryMethod;

/**
 * DATE  2019-08-19
 * 产品Product 类的子类。
 *
 */
public class IDCard extends Product {
    private String owner;

    IDCard(String owner) {
        System.out.println("制作" + owner + "ID卡");
        this.owner = owner;
    }

    @Override
    public void use() {
        System.out.println("使用" + owner + "ID 卡");
    }

    public String getOwner(){
        return owner;
    }
}

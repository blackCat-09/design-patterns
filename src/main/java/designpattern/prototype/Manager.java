package designpattern.prototype;

import java.util.HashMap;

/**
 * DATE  2019-08-19
 *
 *
 */
public class Manager {

    /**
     * 报错实例的名字和实例之间的对应关系
     */
    private HashMap showCase = new HashMap();
    public void register(String name, Product product){
        showCase.put(name, product);
    }

    public Product create(String protoName){
        Product p = (Product)showCase.get(protoName);
        return p.createClone();
    }

}

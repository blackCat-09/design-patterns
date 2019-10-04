package designpattern.factoryMethod;

/**
 * DATE  2019-08-19
 * 工厂方法
 *
 */
public abstract class Factory {

    public final Product create(String owner) {
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    /**
     * 生产产品
     * @param owner
     * @return
     */
    protected abstract Product createProduct(String owner);

    /**
     * 注册产品
     * @param product
     */
    protected abstract void registerProduct(Product product);
}

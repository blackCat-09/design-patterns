package designpattern.prototype;

/**
 * DATE  2019-08-19
 * 复制工具
 *
 */
public interface Product extends Cloneable{
    public abstract void use(String s);
    public abstract Product createClone();
}

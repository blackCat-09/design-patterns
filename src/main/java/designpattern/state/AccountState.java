package designpattern.state;

/**
 * 抽象状态
 */
public abstract class AccountState {

    protected Account acc;
    public String stateName;
    public abstract void deposit(double amount);
    public abstract void withdraw(double amount);
    public abstract void computeInterest();
    public abstract void stateCheck();
}

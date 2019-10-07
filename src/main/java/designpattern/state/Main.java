package designpattern.state;

/**
 * 状态类
 */
public class Main {
	public static void main(String[] args) {
		Account acc = new Account("段誉", 0.0);
		acc.deposit(1000);
		acc.withdraw(2000);
		acc.deposit(3000);
		acc.withdraw(4000);
		acc.withdraw(1000);
		acc.computeInterest();
	}
}

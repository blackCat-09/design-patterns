package designpattern.responsibility;

/**
 * DATE 2019-09-01 抽象处理
 * 
 *
 */
public abstract class Handler {

	// 处理者姓名
	protected String name;
	// 下一个处理者
	protected Handler nextHandler;

	public Handler(String name) {
		this.name = name;
	}

	// 处理请假
	public abstract boolean process(LeaveRequest leaveRequest);

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Handler getNextHandler() {
		return nextHandler;
	}

	public void setNextHandler(Handler nextHandler) {
		this.nextHandler = nextHandler;
	}
}

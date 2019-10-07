package designpattern.mediator;

/**
 * DATE  2019-09-01
 * 抽象同事类
 */
public abstract class AbstractDatabase {

    public static final String MYSQL = "mysql";
    public static final String REDIS = "redis";
    public static final String ELASTICSEARCH = "elasticsearch";

    // 中介者
    protected AbstractMediator mediator;

    public AbstractDatabase(AbstractMediator mediator) {
        this.mediator = mediator;
    }

    public abstract void addData(String data);

    public abstract void add(String data);
}

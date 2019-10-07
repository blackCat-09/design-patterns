package designpattern.mediator;

/**
 * DATE 2019-09-01
 * 抽象中介者
 * 
 */
public abstract class AbstractMediator {

	protected MysqlDatabase mysqlDatabase;
	protected RedisDatabase redisDatabase;
	protected EsDatabase esDatabase;

	public abstract void sync(String databaseName, String data);

	public MysqlDatabase getMysqlDatabase() {
		return mysqlDatabase;
	}

	public void setMysqlDatabase(MysqlDatabase mysqlDatabase) {
		this.mysqlDatabase = mysqlDatabase;
	}

	public RedisDatabase getRedisDatabase() {
		return redisDatabase;
	}

	public void setRedisDatabase(RedisDatabase redisDatabase) {
		this.redisDatabase = redisDatabase;
	}

	public EsDatabase getEsDatabase() {
		return esDatabase;
	}

	public void setEsDatabase(EsDatabase esDatabase) {
		this.esDatabase = esDatabase;
	}
}

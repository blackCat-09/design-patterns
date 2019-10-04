package designpattern.observable;

import java.util.ArrayList;
import java.util.List;

/**
 * DATE 2019-08-31 发布者，该类维护一个订阅者列表，实现订阅、取消订阅、通知所有订阅者
 * （由于观察目标和观察者没有紧密地耦合在一起，因此它们可以属于不同的抽象化层次）
 *
 *
 */
public class Publisher {
	private List<Subscriber> subscribers;

	private boolean pubStatus = false;

	public Publisher() {
		subscribers = new ArrayList<Subscriber>();
	}

	protected void subscribe(Subscriber subscriber) {
		this.subscribers.add(subscriber);
	}

	protected void unsubscribe(Subscriber subscriber) {
		if (this.subscribers.contains(subscriber)) {
			this.subscribers.remove(subscriber);
		}
	}

	protected void notifySubscribers(String publisher, String articleName) {
		if (this.pubStatus == false) {
			return;
		}
		for (Subscriber subscriber : this.subscribers) {
			subscriber.receive(publisher, articleName);
		}
		this.clearPubStatus();
	}

	protected void setPubStatus() {
		this.pubStatus = true;
	}

	protected void clearPubStatus() {
		this.pubStatus = false;
	}
}

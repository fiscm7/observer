package java2s;

import java.util.ArrayList;
import java.util.List;

public class MyValue {
	private List<Observer> observers = new ArrayList<Observer>();

	private String state;

	public String getState() {
		return state;
	}

	public void setState(String string) {
		this.state = string;
		notifyAllObserver();
	}

	public void attach(Observer observer) {
		observers.add(observer);
	}

	public void notifyAllObserver() {
		for (Observer observer : observers) {
			observer.update();
		}
	}
}

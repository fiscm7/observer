package java2s;

public class ScreenObserver extends Observer {

	public ScreenObserver(MyValue subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {

		System.out.println("Screen: " + subject.getState() + "\n");

	}

}

package java2s;

public class EmailObserver extends Observer {
	
	public EmailObserver(MyValue subject) {
		this.subject = subject;
		this.subject.attach(this);
	}

	@Override
	public void update() {

		System.out.println("Email: " + subject.getState());

	}

}

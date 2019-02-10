package lamda;

public class Home implements HelloMessage {

	@Override
	public void sayHello(String name) {
		System.out.println("Welcome home " + name);
		
	}

}

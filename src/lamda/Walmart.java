package lamda;

public class Walmart implements HelloMessage {

	@Override
	public void sayHello(String name) {
		System.out.println("Weclome to Walmart " + name);
		
	}

}

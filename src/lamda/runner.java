package lamda;

public class runner {

	public static void main(String[] args) {
		
			/* create a separate class for each different variation of hello message
			 */
		
//		HelloMessage hell0 = new HelloMessage();
		
//		HelloMessage hello1 = new Cybertek();
//		HelloMessage hello2 = new Walmart();
//		HelloMessage hello3 = new Home();
//		
//		hello1.sayHello("Z");
//		hello2.sayHello("Z");
//		hello3.sayHello("Z");
		
		
//		Prior to Java 8, functional programming was called "inner class" / "annonymous class"
//		HelloMessage hello = new HelloMessage() {
//
//			@Override
//			public void sayHello(String name) {
//				System.out.println("Hello " + name);			
//			}};
//			
//			hello.sayHello("Z");
			
			System.out.println("======================================");
	
		// you can take your method and reconstruct into a lambda expression
		HelloMessage hello4 = (String name) -> {
			System.out.println("Hello! Welcome " + name);
		};
		
		hello4.sayHello("Z");
		
		// Data type is optional (STRING name)
		// parenthesis is optional if you have only 1 parameter
		// {} brackets are optional if your code is 1 line
		
		HelloMessage hello5 = name -> System.out.println("Hello! Welcome " + name);
		
		hello5.sayHello("Z");
		
		}
}
	


package lamda2;

public class Tester {

	public static void main(String[] args) {

		MathFunctions add = (x, y) -> x+y;
		MathFunctions mulitply = (x, y) -> x * y;

		MathFunctions divide = (x, y) -> x / y;

//		 if we want to make a safe divide method where it doesn't divide by 0; then
//		 add an if block:
//		MathFunctions divide = (x, y) -> {
//
//			if (y == 0)
//				return 0;
//			return x / y;
//
//		};

		MathFunctions random = (x, y) -> (int) (Math.random() * 100) + (x * y);

		System.out.println(add.function(3, 5));
		System.out.println(mulitply.function(3, 4));
		System.out.println(divide.function(12, 2));
		System.out.println(random.function(3, 3));

		EvenOdd num = x -> x % 2 == 0;

		System.out.println(num.numCheck(6));
		
		// note - you are basically creating a variable of the interface and assigning a peice of code to it that you can use. Similar to string or int.
	}

}

package lamdaList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Tester {
	public static void main(String[] args) {

		List<String> names = new ArrayList<>();

		names.add("A");
		names.add("B");
		names.add("C");
		names.add("D");

		for (String name : names) {
			System.out.println(name);
		}

		System.out.println("======================================");

		// java knows that name is type STRING
		names.forEach(name -> System.out.println(name));

		System.out.println("======================================");

		ArrayList<Integer> numList = new ArrayList<>();

		numList.add(2);
		numList.add(4);
		numList.add(5);
		numList.add(1);
		numList.add(3);

		Collections.sort(numList);

		System.out.println(numList);
		
		System.out.println("======================================");

		Collections.sort(numList, (n1, n2) -> n1.compareTo(n2));

		System.out.println(numList);

		System.out.println("======================================");
		numList.forEach(n -> {
			n += 2;
			System.out.println(n);
		});

	}

}

package session9;

import java.util.*;

public class FourthProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaring HashSet signature using Generic Integer

		Set<Integer> input1 = new HashSet<Integer>();

		// declaring HashSet signature using Generic Integer

		Set<Integer> input2 = new HashSet<Integer>();

		// Adding values in First Set

		input1.add(5);
		input1.add(8);
		input1.add(9);

		System.out.println("Set1 values are:");

		// printing the Set1 Values

		for (Integer inputs : input1) {

			System.out.println(inputs);

		}

		// Adding values in Second Set

		input2.add(15);
		input2.add(10);
		input2.add(30);
		input2.add(9);

		System.out.println("Set2 values are:");

		// printing the Set2 Values

		for (Integer inputs : input2) {

			System.out.println(inputs);

		}

		System.out.println("Copying all the elements from Set2 to Set1");

		// Adding the Set2 values in Set1

		input1.addAll(input2);

		// Iterating through the Set1

		for (Integer inputs : input1) {

			System.out.println(inputs);

		}

	}

}

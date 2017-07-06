package session9;

import java.util.*;

public class SecondProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaring ArrayList signature using Generic Integer

		ArrayList<Integer> obj = new ArrayList<Integer>();

		// Creating the Scanner signature

		Scanner in = new Scanner(System.in);

		System.out.println("Enter total number of inputs");

		int input = in.nextInt();// calling the user integer value

		System.out.println("Enter the numbers");

		// Adding the user defined values in object through for each loop

		for (int i = 0; i < input; i++) {

			obj.add(in.nextInt());

		}

		in.close();// closing the Scanner object

		System.out.println("Numbers are");

		// Iterating through the list

		for (Integer numbers : obj) {

			System.out.println(numbers);

		}

		System.out.println("Printing Even numbers");

		// checking for even numbers in the list

		for (Integer input1 : obj) {

			if (input1 % 2 == 0) {

				System.out.println(input1);

			}

		}

	}

}

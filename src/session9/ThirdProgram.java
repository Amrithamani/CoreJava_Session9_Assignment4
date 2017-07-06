package session9;

import java.util.*;

public class ThirdProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaring ArrayList signature using Generic Integer

		ArrayList<Integer> obj = new ArrayList<Integer>();

		// declaring TreeSet signature using Generic Integer

		TreeSet<Integer> obj1 = new TreeSet<Integer>();

		// Creating the Scanner signature

		Scanner in = new Scanner(System.in);

		System.out.println("Enter total number of inputs");

		// calling the user defined value

		int input = in.nextInt();

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

		// Adding duplicate values in TreeSet object

		for (int i = 0; i < input; i++) {

			for (int j = 0; j < input; j++) {

				if (obj.get(i) == obj.get(j) && i != j) {

					obj1.add(obj.get(i));
				}

			}
		}

		System.out.println("Printing duplicate values");

		// Iterating through the Set

		for (Integer duplicates : obj1) {

			System.out.println(duplicates);

		}

	}

}

package session9;

import java.util.*;

class Employee {

	// Initializing private variables

	private String name;

	private String designation;

	private double salary;

	// Initializing Parameterized Constructor

	Employee(String name, String designation, double salary) {

		// Assigning instance variables

		this.name = name;

		this.designation = designation;

		this.salary = salary;

	}

	// declaring getter for name

	public String getName() {
		return name;
	}

	// declaring getter for designation

	public String getDesignation() {
		return designation;
	}

	// declaring getter for salary

	public double getSalary() {
		return salary;
	}

	// converting properties objects to String using toString method

	public String toString() {
		return "Name: " + this.name + "-- Designation: " + this.designation + "-- Salary: " + this.salary;
	}

}

// Custom defined Comparator class

class SalaryComp implements Comparator<Employee> {

	@Override
	public int compare(Employee e1, Employee e2) {
		// TODO Auto-generated method stub

		// Values will be sorted based on the conditions

		if (e1.getSalary() == e2.getSalary()) {

			return e1.getName().compareTo(e2.getName());

		} else if (e1.getName().equals(e2.getName())) {

			return e1.getDesignation().compareTo(e2.getDesignation());

		} else if (e1.getSalary() > e2.getSalary()) {

			return 1;

		} else {

			return -1;

		}

	}
}

public class FirstProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// declaring TreeSet signature using Generic Employee class

		TreeSet<Employee> obj = new TreeSet<Employee>(new SalaryComp());

		// Adding the values in TreeSet

		obj.add(new Employee("Amritha", "Manager", 30000));

		obj.add(new Employee("Kaushik", "Staff", 15000));

		obj.add(new Employee("Sheela", "Manager", 30000));

		obj.add(new Employee("Amritha", "Staff", 15000));

		obj.add(new Employee("Tanaya", "Temporary Staff", 8000));

		// Iterating through the each values

		for (Employee e : obj) {

			System.out.println(e);
			// prints the TreeSet values

		}

	}

}

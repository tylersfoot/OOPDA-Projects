/**
* OOPDA Lab 03-A    Explore the Comparable interface
*
* Student:          Tyler Depa
* Attribution: This is my original work. No help received.
* 
* Purpose: ⁤This ⁤⁤project includes a student class, which implements Comparable<Student>. ⁤
* ⁤The Student class has name, id, and birthdate fields, along with constructor, getters, 
* toString, and compareTo methods. ⁤⁤The compareTo method compares the id of two students, 
* and returns -1, 0, or 1. ⁤⁤The Tester class creates an ArrayList of multiple students, and 
* sorts the ArrayList using Collections.sort(), which relies on compareTo() from the Student 
* class. ⁤The purpose of the project is to demonstrate how objects can be sorted in custom 
* orders by implementing the Comparable interface and overriding the compareTo() method. ⁤
*
*
* @author (Tyler Depa)
* @version (01/29/2024)
*/

import java.util.ArrayList;
import java.util.Collections;

public class Tester {

	public static void main(String[] args) {
		ArrayList<Student> roster = new ArrayList<Student>();
		roster.add(new Student("Smith", 1234, 19980422));
		roster.add(new Student("Jones", 1122, 19990422));
		roster.add(new Student("Thomas", 4567, 20000422));
		roster.add(new Student("Rubens", 0345, 19981122));
		display(roster);
		Collections.sort(roster);
		System.out.println("\nby ID Ascending:");
		display(roster);
	}

	public static void display(ArrayList<Student> section) {
		System.out.println("Name\tID\tBirthdate");
		for(Student s : section)
		System.out.println(s);
	}

}

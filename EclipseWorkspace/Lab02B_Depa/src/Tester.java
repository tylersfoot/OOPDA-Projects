/**
* OOPDA Lab 02-2    Create an Interface
*
* Student:          Tyler Depa
* Attribution: This is my original work. No help received.
*
* Purpose: This project includes creating an Interface RoleDisplayable, Student and Instructor classes which implement RoleDisplayable,
* creating default displayNameAndRole method, overriding the method in Instructor, creating a RoleDisplayable ArrayList, 
* and iterating through the ArrayList with a for-each loop, calling displayNameAndRole.
*
* @author (Tyler Depa)
* @version (01/24/2024)
*/

import java.util.ArrayList;

public class Tester {

	public static void main(String[] args) {

        ArrayList<RoleDisplayable> people = new ArrayList<RoleDisplayable>();

        people.add(new Student("John Doe"));
        people.add(new Student("Michael White"));
        people.add(new Student("Henry Clark"));
        people.add(new Student("Sophia Wilson"));
        people.add(new Student("Alice Smith"));
        people.add(new Instructor("Abe Lincoln"));
        people.add(new Instructor("Bob Johnson"));
        people.add(new Instructor("Charlie Brown"));
        people.add(new Instructor("David Miller"));
        people.add(new Instructor("Edward Taylor"));

        people.forEach(person -> person.displayNameAndRole());

	}

}

/**
* OOPDA HW 03-A    Paper Route Enhanced
*
* Student:          Tyler Depa
* Attribution: This is my original work. No help received.
* 
* Purpose: ⁤This ⁤⁤project includes a Customer class, which has fields for name, address, city, and subscription type.
* The PaperRoute class has an ArrayList of customers, and methods to add customers, calculate the total cost for all customers,
* to display all the customers, and to count the number of customers with a given subscription type. The Tester class creates fake customers,
* adds them to a PaperRoute, and then calls each method to test them.
*
*
* @author (Tyler Depa)
* @version (02/03/2024)
*/

public class Tester {

	public static void main(String[] args) {

		PaperRoute myCusts = new PaperRoute();
		myCusts.addCustomer("Joe Benson", "173 Neptune Rd", "Morristown", true, true, 9.99);
		myCusts.addCustomer("Jeff Ransack", "14 Clam St", "Terrortown", true, false, 14.99);
		myCusts.addCustomer("Martha Myers", "38 Rose Ave", "Grassville", false, true, 9.99);
		myCusts.addCustomer("Robert Porter", "327 Bell St", "Ring Harbor", true, true, 5.99);
		myCusts.addCustomer("Geoff Slobber", "3 Johnson Rd", "Grassville", false, true, 14.99);
		myCusts.addCustomer("Ted Leather", "16 Evergreen Rd", "Brookshade", true, false, 14.99);
		myCusts.addCustomer("Agatha Agatha", "84 Baker St", "Silverpeak", true, false, 9.99);
		myCusts.addCustomer("Josephi Mandel", "690 Twilight Rd", "Morristown", false, true, 9.99);
		myCusts.addCustomer("Brodie Best", "11 Azure Ave", "Grassville", false, true, 14.99);
		myCusts.addCustomer("Jeffrey Bagel", "323 Quartz Ave", "Silverpeak", true, false, 14.99);
		myCusts.addCustomer("Obama Obama", "871 Golden Ave", "Brookshade", false, true, 5.99);
		myCusts.addCustomer("Steven Hawks", "2 Maple St", "Terrortown", true, false, 5.99);
		myCusts.listAccounts();

		System.out.println("\nTotal amount due from all Customers: $" + myCusts.totDue());
		System.out.println("Customers subscribed daily: " + myCusts.countBySubscriptionType("daily"));
		System.out.println("Customers subscribed on Sunday: " + myCusts.countBySubscriptionType("Sunday"));
		System.out.println("Customers subscribed for both: " + myCusts.countBySubscriptionType("both"));


	}

}

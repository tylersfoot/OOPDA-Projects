
*/

public class Tester {

	public static void main(String[] args) {

		PaperRoute myCusts = new PaperRoute();
		myCusts.addCustomer("Joe Benson", "173 Neptune Rd", "Morristown", true, true, 12.20);
		myCusts.addCustomer("Jeff Ransack", "14 Clam St", "Terrortown", true, false, 9.99);
		myCusts.addCustomer("Martha Myers", "38 Rose Ave", "Grassville", false, true, 12.20);
		myCusts.addCustomer("Robert Porter", "327 Bell St", "Ring Harbor", true, true, 7.50);
		myCusts.displayAll();

		System.out.println("Total amount due from all Customers: $" + myCusts.totDue());
		System.out.println("Customers subscribed daily: " + myCusts.co
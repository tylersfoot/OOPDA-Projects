
public class Tester {

	public static void main(String[] args) {
		Wallet myMoney = new Wallet();
		
		myMoney.addBill(10, "2004A");
		myMoney.addBill(5, "2004B");
		myMoney.addBill(5, "1998");
		myMoney.addBill(100, "2013A");
		myMoney.addBill(1, "2004");
		myMoney.addBill(1, "2012A");
		myMoney.addBill(20, "1998A");
		myMoney.addBill(5, "2013A");
		
		myMoney.displayAll();

		System.out.println("Total value of wallet: $" + myMoney.totValue());

		System.out.println("Number of bills in series '2004': " + myMoney.countBySeries("2004"));



	}

}

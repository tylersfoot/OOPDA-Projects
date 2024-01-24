import java.util.ArrayList;

public class Wallet {
	private ArrayList<Bill> billsList;
	
	public Wallet() {
		this.billsList = new ArrayList<Bill>();
	}

	void addBill(int value, String series) {
		billsList.add(new Bill(value, series));
	}

	int totValue() {
		int total = 0;
		for (Bill bill : billsList) {
			total += bill.getValue();
		}
		return total;
	}

	void displayAll() {
		for (Bill bill : billsList) {
			System.out.println(bill);
		}
	}

	int countBySeries(String sn) {
		int count = 0;
		for (Bill bill : billsList) {
			if (bill.getSeries().contains(sn)) {
				count += 1;
			}
		}
		return count;
	}
}

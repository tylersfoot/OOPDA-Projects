
import java.util.ArrayList;
import java.util.Collections;

public class PaperRoute {
    private ArrayList<Customer> customers;

    public PaperRoute() {
        customers = new ArrayList<Customer>();
    }

    void addCustomer(String name, String streetAddress, String city, boolean hasDaily, boolean hasSunday, double amountDue) {
        customers.add(new Customer(name, streetAddress, city, hasDaily, hasSunday, amountDue));
    }

    double totDue() {
        double total = 0;
        for (Customer customer : customers) {
            total += customer.getAmountDue();
        }
        return total;
    }

    void displayAll() {
        System.out.println("Name\t\tStreet Address\tCity\t\tSubscription\tAmount Due");
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
    
    void listAccounts() {
    		ArrayList<Customer> customersSorted = customers;
    		Collections.sort(customersSorted);
    		for (Customer customer : customersSorted) {
    			System.out.println(customer);
    		}
    }

    int countBySubscriptionType(String kind) {
        int count = 0;
        for (Customer customer : customers) {
            if (kind.equals("daily") && customer.getHasDaily()) {
                count++;
            } else if (kind.equals("Sunday") && customer.getHasSunday()) {
                count++;
            } else if (kind.equals("both") && customer.getHasDaily() && customer.getHasSunday()) {
                count++;
            }
        }
        return count;
    }
}

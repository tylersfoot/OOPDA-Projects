
public class Customer {

    private String name;
    private String streetAddress;
    private String city;
    private boolean hasDaily; // gets delivery weekdays Mon--Sat
    private boolean hasSunday; // gets delivery of Sunday
    private double amountDue; // current balance

    public Customer(String name, String streetAddress, String city, boolean hasDaily, boolean hasSunday, double amountDue) {
        this.name = name;
        this.streetAddress = streetAddress;
        this.city = city;
        this.hasDaily = hasDaily;
        this.hasSunday = hasSunday;
        this.amountDue = amountDue;
    }

    public String getName() {
        return name;
    }

    public String getStreetAddress() {
        return streetAddress;
    }

    public String getCity() {
        return city;
    }

    public boolean getHasDaily() {
        return hasDaily;
    }

    public boolean getHasSunday() {
        return hasSunday;
    }

    public double getAmountDue() {
        return amountDue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setStreetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public void setHasDaily(boolean hasDaily) {
        this.hasDaily = hasDaily;
    }

    public void setHasSunday(boolean hasSunday) {
        this.hasSunday = hasSunday;
    }

    public void setAmountDue(double amountDue) {
        this.amountDue = amountDue;
    }

    @Override
    public String toString() {
        String subscription = "";
        if (getHasDaily()) {
            subscription = "Daily";
        } else if (getHasSunday()) {
            subscription = "Sunday";
        } else if (getHasDaily() && getHasSunday()) {
            subscription = "Both";
        }
        return name + "\t" + streetAddress + "\t" + city + "\t" + subscription + "\t\t$" + amountDue;
    }
}

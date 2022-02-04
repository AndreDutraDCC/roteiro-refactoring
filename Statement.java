import java.util.Enumeration;

public abstract class Statement {
    protected abstract String showRentalRecord(String name);
    protected abstract String showRentalFigures(String movieTitle, String charge);
    protected abstract String showtotalCharge(String totalCharge);
    protected abstract String showTotalFrequentRenterPoints(String totalFrequentRenterPoints);

    public String value(Customer aCustomer) {
        Enumeration rentals = aCustomer.getRentals();
        String result = showRentalRecord(aCustomer.getName());
        while (rentals.hasMoreElements()) {
           Rental each = (Rental) rentals.nextElement();
           result += showRentalFigures(each.getMovie().getTitle(), String.valueOf(each.getCharge()));
        }
        //add footer lines
        result += showtotalCharge(String.valueOf(aCustomer.getTotalCharge()));
        result += showTotalFrequentRenterPoints(String.valueOf(aCustomer.getTotalFrequentRenterPoints()));
        return result;
    }
}

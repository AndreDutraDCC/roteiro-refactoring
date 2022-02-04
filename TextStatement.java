import java.util.Enumeration;

public class TextStatement extends Statement {
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

    protected String showRentalRecord(String name) {
        return "Rental Record for " + name + "\n";
    }

    protected String showRentalFigures(String movieTitle, String charge) {
        return "\t" + movieTitle + "\t" + charge + "\n";
    }

    protected String showtotalCharge(String totalCharge) {
        return "Amount owed is " + totalCharge + "\n";  
    }

    protected String showTotalFrequentRenterPoints(String totalFrequentRenterPoints) {
        return "You earned " + totalFrequentRenterPoints + " frequent renter points";
    }
}
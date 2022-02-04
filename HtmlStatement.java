import java.util.Enumeration;

public class HtmlStatement extends Statement {
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
        return "<H1>Rentals for <EM>" + name + "</EM></H1><P>\n";
    }

    protected String showRentalFigures(String movieTitle, String charge) {
        return movieTitle + ": " + charge + "<BR>\n";
    }

    protected String showtotalCharge(String totalCharge) {
        return  "<P>You owe <EM>" + totalCharge + "</EM><P>\n";
    }

    protected String showTotalFrequentRenterPoints(String totalFrequentRenterPoints) {
        return "On this rental you earned <EM>" + totalFrequentRenterPoints +
        "</EM> frequent renter points<P>";
    }
}
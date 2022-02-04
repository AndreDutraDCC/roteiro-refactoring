public class TextStatement extends Statement {

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
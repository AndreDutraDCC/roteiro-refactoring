public class HtmlStatement extends Statement {
    
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
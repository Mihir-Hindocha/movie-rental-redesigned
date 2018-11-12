import java.util.ArrayList;
import java.util.Iterator;

public class Customer {
    private String name;
    private ArrayList<MovieRental> movieRentals = new ArrayList<>();


    public Customer(String name) {
        this.name = name;
    }

    public void addRental(MovieRental arg) {
        movieRentals.add(arg);
    }

    public String getName() {
        return name;
    }


    public String getStatement() {

        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Iterator<MovieRental> rentals = this.movieRentals.iterator();
        String result = "MovieRental Record for " + getName() + "\n";

        while (rentals.hasNext()) {

            double thisAmount = 0;
            MovieRental each = (MovieRental) rentals.next();

            thisAmount = each.calculateRent();

            // add frequent renter points
            frequentRenterPoints++;

            // add bonus for a two day new release rental
            if ((each.getMovie().getPriceCode() == Movie.NEW_RELEASE) &&
                    (each.getDaysRented() > 1)) {
                frequentRenterPoints++;
            }

            // show figures for this rental
            result += "\t" + each.getMovie().getTitle() +
                    "\t" + String.valueOf(thisAmount) + "\n";
            totalAmount += thisAmount;
        }

        // add footer lines
        result += "Amount owed is " + String.valueOf(totalAmount) + "\n";
        result += "You earned " + String.valueOf(frequentRenterPoints) +
                " frequent renter points";
        return result;
    }
}
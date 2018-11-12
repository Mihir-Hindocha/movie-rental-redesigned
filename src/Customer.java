import Books.*;
import Movie.*;

import java.util.ArrayList;
import java.util.Iterator;

public class Customer {
    private String name;
    private ArrayList<Movie> movieRentals = new ArrayList<>();
    private ArrayList<Movie> moviePurchases = new ArrayList<>();
    private ArrayList<Book> bookRentals = new ArrayList<>();
    private ArrayList<Book> bookPurchases = new ArrayList<>();


    public Customer(String name) {
        this.name = name;
    }

    public void addMovieRental(MovieRental newMovie) {
        movieRentals.add(newMovie);
    }

    public void addMoviePurchase(MoviePurchase newMovie) {
        moviePurchases.add(newMovie);
    }

    public void addBookRental(Book newBook) {
        bookRentals.add(newBook);
    }

    public void addBookPurchase(BookPurchase newBook) {
        bookPurchases.add(newBook);
    }

    public String getName() {
        return name;
    }


    public String getStatement() {

        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Iterator<Movie> rentals = this.movieRentals.iterator();
        String result = "Rental Record for " + getName() + "\n\n";
        result += "<Name>" + getName() + "</Name>" + "\n";

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
            result += "\t" + "<Movie> " + each.getMovie().getTitle() + "</Movie> "+
                    "\n\t\t" + "<Value> " + String.valueOf(thisAmount) + "</Value>" + "\n";
            totalAmount += thisAmount;
        }

        // add footer lines
        result += "<TotalAmount> " + String.valueOf(totalAmount) + "</TotalAmount> " + "\n";
        result += "<FrequentRenterPoints> " + String.valueOf(frequentRenterPoints) +
                " </FrequentRenterPoints>";
        return result;
    }


}
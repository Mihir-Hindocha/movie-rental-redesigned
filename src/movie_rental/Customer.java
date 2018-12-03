package movie_rental;
import java.util.ArrayList;
import java.util.Iterator;

import movie.*;

public class Customer {
    private String name;
    private boolean isFirst;
    private boolean hasNewRelease;
    private int age;
    private ArrayList<Movie> movieRentals = new ArrayList<>();
    private ArrayList<Movie> moviePurchases = new ArrayList<>();
 
    public Customer(String name, int age) {
        this.name = name;
        this.age = age;
        this.isFirst = true;
        this.hasNewRelease = false;
    }

    public boolean isHasNewRelease() {
		return hasNewRelease;
	}

	public void setHasNewRelease(boolean hasNewRelease) {
		this.hasNewRelease = hasNewRelease;
	}

	public void addMovieRental(MovieRental newMovie) {
        movieRentals.add(newMovie);
    }

    public void addMoviePurchase(MoviePurchase newMovie) {
        moviePurchases.add(newMovie);
    }

    public String getName() {
        return name;
    }
    
	public boolean isFirst() {
		return isFirst;
	}

	public void setFirst(boolean isFirst) {
		this.isFirst = isFirst;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}


    public String getStatement() {

        double totalAmount = 0;
        int frequentRenterPoints = 0;
        Iterator<Movie> rentals = this.movieRentals.iterator();
        String result = "Rental Record for " + getName() + "\n\n";
        result += "<Name> " + getName() + " </Name>" + "\n" + "<Age> " + getAge() + " </Age>" + "\n<Movies>\n";

        while (rentals.hasNext()) {

            double thisAmount = 0;
            MovieRental each = (MovieRental) rentals.next();

            thisAmount = each.calculateRent();
            
            if(each.getMovie().getPriceCode() == 1) {
            	setHasNewRelease(true);
            }

            frequentRenterPoints += each.calculateFrequentRenterPoints();
            
            /*
             * 2) b. The first new frequent rental point computation gives double regular points to any customer who is 
             * 18-22 and renting one or multiple new release movies.
             */
            if(isFirst() && hasNewRelease && getAge() >= 18 && getAge() <= 22) {
            	frequentRenterPoints *= 2;
            }
            
            
            
            /*
             * 3) If the Frequent Renter Points of the user becomes 10 or greater then it is calculated to be a free movie rental. 
             */
            if (frequentRenterPoints >= 10) {
            	thisAmount = 0;
            	frequentRenterPoints -= 10;
            }

            // show figures for this rental
            result += "\t<Movie> " + "\n\t\t<Title> " + each.getMovie().getTitle() + " </Title>" + "\n\t\t" +
            		  "<Value> " + String.valueOf(thisAmount) + " </Value>" + 
            		"\n\t\t<FrequentRenterPoints> " + String.valueOf(frequentRenterPoints) + " </FrequentRenterPoints>" +"\n\t </Movie>" + "\n";
            
            totalAmount += thisAmount;
        }
        
        /*
         * This boolean is set to false to show that the customer has been to the store before and it is not his first time.
         */
        setFirst(false);

        // add footer lines
        result += "</Movies> " + "\n<TotalAmount> " + String.valueOf(totalAmount) + "</TotalAmount> " + "\n";
        result += "<FrequentRenterPoints> " + String.valueOf(frequentRenterPoints) + " </FrequentRenterPoints>";
        return result;
    }
    		
}
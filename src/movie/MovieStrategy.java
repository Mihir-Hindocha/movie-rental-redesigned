package movie;

import movie_rental.Customer;

/**
 * Class defined to implement the Strategy Pattern for calculating the rent and getting the purchase price dynamically at runtime based on the
 * input MovieRental or MoviePurchase parameter. This class strategizes the calculateRent and getPurchasePrice methods.
 */
public class MovieStrategy {

    /**
     * Moved method from the original class to Strategy class created. Further factory pattern and polymorphism is applied to the method.
     */
    public double calculateRent(MovieRental each) {
        // determine amounts for each line
        double thisAmount = 0.0;
        MovieStrategy movieStrategy = new MovieFactory().getMovieRentStrategy(each);
        thisAmount = movieStrategy.calculateRent(each);
        return thisAmount;
    }

    /**
     * Added this method to fetch the purchase price. Further factory pattern and polymorphism are applied to this method.
     */
    public double getPurchasePrice(MoviePurchase each){
        double thisAmount = 0.0;
        MovieStrategy movieStrategy = new MovieFactory().getMoviePurchaseStrategy(each);
        thisAmount = movieStrategy.getPurchasePrice(each);
        return thisAmount;
    }
    
    /**
	 * Added this method to calculate the FrequentRenterPoints for particular Rental. Further factory pattern and polymorphism
	 * are applied to this method.
     * @param customer 
	 */
	public int calculatePoints(MovieRental each){
	    int frequentRenterPoints = 0;
	    MovieStrategy movieStrategy = new MovieFactory().getMoviePointsStrategy(each);
	    frequentRenterPoints = movieStrategy.calculatePoints(each);
	    return frequentRenterPoints;
	}
}

	
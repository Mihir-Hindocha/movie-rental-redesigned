package movie;

import movie_rental.Customer;

/**
 * MovieRental inherits from Movie class and the user's request regarding rent are completed using this class.
 * It acts as an interface as all the remaining work is done dynamically in the back end.
 */
public class MovieRental extends Movie{
    private Movie movie;
    private int daysRented;
    
    public MovieRental(Movie movie, int daysRented) {
            this.movie = movie;
            this.daysRented = daysRented;
    }
    
    public int getDaysRented() {
        return daysRented;
    }
    
    public Movie getMovie() {
        return movie;
    }

    public double calculateRent(){
        return new MovieFactory().getMovieRentStrategy(this).calculateRent(this);
    }

	public int calculateFrequentRenterPoints() {
		return new MovieFactory().getMoviePointsStrategy(this).calculatePoints(this);
	}

}
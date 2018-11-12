package Movie;

/**
 * MovieRental inherits from Book class and the user's request regarding rent are completed using this class.
 * It acts as an interface as all the remaining work is done dynamically in the back end.
 */
public class MovieRental extends Movie{
    private Movie movie;
    private int daysRented;
    /**
     * MovieStrategy object created to call the methods using appropriate subclasses at runtime.
     */
    private MovieStrategy movieStrategy = new MovieStrategy();
    
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

}
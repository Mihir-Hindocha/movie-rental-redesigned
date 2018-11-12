package Movie;

/**
 * Factory Class defined to create the appropriate object of the type of Regular, New Release or Children.
 */
public class MovieFactory {

    /**
     * Factory method creates object of the appropriate subclass at runtime based on the MovieRental Object passed as parameter.
     */
    public static MovieStrategy getMovieRentStrategy(MovieRental each) {
        switch (each.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                return new RegularStrategy();
            case Movie.NEW_RELEASE:
                return new NewReleaseStrategy();
            case Movie.CHILDREN:
                return new ChildrenStrategy();
        }
        return null;
    }

    /**
     * Factory method creates object of the appropriate subclass at runtime based on the MoviePurchase Object passed as parameter.
     */
    public MovieStrategy getMoviePurchaseStrategy(MoviePurchase each) {
        switch (each.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                return new RegularStrategy();
            case Movie.NEW_RELEASE:
                return new NewReleaseStrategy();
            case Movie.CHILDREN:
                return new ChildrenStrategy();
        }
        return null;
    }
}

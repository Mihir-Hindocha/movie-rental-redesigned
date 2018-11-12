public class MovieFactory {

    public static MovieRentStrategy getMovieRentStrategy(MovieRental each) {
        switch (each.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                return new RegularRentStrategy();
            case Movie.NEW_RELEASE:
                return new NewReleaseRentStrategy();
            case Movie.CHILDREN:
                return new ChildrenRentStrategy();
        }
        return null;
    }

}

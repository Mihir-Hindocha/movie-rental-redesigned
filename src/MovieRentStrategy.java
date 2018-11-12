public class MovieRentStrategy {

    public double calculateRent(MovieRental each) {
        // determine amounts for each line
        double thisAmount = 0.0;
        MovieRentStrategy movieRentStrategy = new MovieFactory().getMovieRentStrategy(each);
        thisAmount = movieRentStrategy.calculateRent(each);
        return thisAmount;
    }
}
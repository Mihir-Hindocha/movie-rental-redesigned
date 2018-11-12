public class MovieRental {
    private Movie movie;
    private int daysRented;
    private MovieRentStrategy movieRentStrategy = new MovieRentStrategy();
    
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
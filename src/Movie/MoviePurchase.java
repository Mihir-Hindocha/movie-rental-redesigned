package Movie;

/**
 * MoviePurchase inherits from Movie class and the user's request regarding purchase are completed using this class.
 * It acts as an interface as all the remaining work is done dynamically in the back end.
 */
public class MoviePurchase extends Movie{
    private Movie movie;

    /**
     * MovieStrategy object created to call the methods using appropriate subclasses at runtime.
     */
    private MovieStrategy movieStrategy = new MovieStrategy();

    MoviePurchase(Movie movie){
        this.movie = movie;
    }
    public Movie getMovie() {
        return movie;
    }

    public double getPurchasePrice(){
        return new MovieFactory().getMoviePurchaseStrategy(this).getPurchasePrice(this);
    }
}

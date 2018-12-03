package movie;

/**
 * Class defined to store the different types of Movies for Rent and Sell.
 */
public class Movie {

    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    public static final int CHILDREN = 2;
    /**
     * Title of the movie.
     */
    private String title;
    /**
     * Used to determine the type of movie.
     */
    private int priceCode;
    /**
     * Maintains the number of Copies that movie has left.
     */
    private int count;

    public Movie(){}

    public Movie(String title, int priceCode, int count) {
        this.title = title;
        this.priceCode = priceCode;
        this.count = count;
    }

    public int getPriceCode() {
        return priceCode;
    }

    public void setPriceCode(int arg) {
        priceCode = arg;
    }

    /**
     * To get the number of Book items left.
     */
    public int getCount() {
        return count;
    }

    /**
     * Method to increase the number of available copies.
     */
    public void incrementCount() {
        count++;
    }

    /**
     * Helper method to decrement the number of available copies if there are any available.
     * Will be used to maintain the number of copies that can be sold or rented.
     * @return true if copy was available, false otherwise.
     */
    public boolean decrementCount() {
        if (count == 0) {
            return false;
        } else {
            count--;
            return true;
        }
    }

    public String getTitle() {
        return title;
    }
}
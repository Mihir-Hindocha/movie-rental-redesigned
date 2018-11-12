public class Movie {

    public static final int CHILDREN = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
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
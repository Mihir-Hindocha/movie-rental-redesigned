public class RegularRentStrategy extends MovieRentStrategy {

    public static final int REGULAR_BASE_PRICE = 2;
    public static final int REGULAR_DURATION = 2;
    public static final double REGULAR_VARIABLE_PRICE = 1.5;

    public double calculateRent(MovieRental each) {
        double thisAmount = 0.0;
        thisAmount += REGULAR_BASE_PRICE;
        if (each.getDaysRented() > REGULAR_DURATION) {
            thisAmount += (each.getDaysRented() - REGULAR_DURATION) * REGULAR_VARIABLE_PRICE;
        }
        return thisAmount;
    }
}

public class NewReleaseRentStrategy extends MovieRentStrategy {

    public static final int NEW_RELEASE_PRICE = 3;

    public double calculateRent(MovieRental each) {
        double thisAmount = 0.0;
        thisAmount += each.getDaysRented() * NEW_RELEASE_PRICE;
        return thisAmount;
    }
}

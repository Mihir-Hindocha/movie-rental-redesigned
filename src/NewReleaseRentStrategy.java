public class NewReleaseRentStrategy extends MovieRentStrategy {
    @Override
    public double calculateRent(MovieRental each) {
        double thisAmount = 0.0;
        thisAmount += each.getDaysRented() * 3;
        return thisAmount;
    }
}

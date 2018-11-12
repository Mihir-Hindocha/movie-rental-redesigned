public class RegularRentStrategy extends MovieRentStrategy {
    @Override
    public double calculateRent(MovieRental each) {
        double thisAmount = 0.0;
        thisAmount += 2;
        if (each.getDaysRented() > 2) {
            thisAmount += (each.getDaysRented() - 2) * 1.5;
        }
        return thisAmount;
    }
}

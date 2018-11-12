public class ChildrenRentStrategy extends MovieRentStrategy{
    @Override
    public double calculateRent(MovieRental each) {
        double thisAmount = 0.0;
        thisAmount += 1.5;
        if (each.getDaysRented() > 3) {
            thisAmount += (each.getDaysRented() - 3) * 1.5;
        }
        return thisAmount;
    }
}

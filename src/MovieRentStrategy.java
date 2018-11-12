public class MovieRentStrategy implements Rentable {

    public double calculateRent(MovieRental each) {
        // determine amounts for each line
        double thisAmount = 0.0;
        switch (each.getMovie().getPriceCode()) {
            case Movie.REGULAR:
                thisAmount = new RegularRentStrategy().calculateRent(each);
                break;
            case Movie.NEW_RELEASE:
               thisAmount = new NewReleaseRentStrategy().calculateRent(each);
                break;
            case Movie.CHILDREN:
                thisAmount = new ChildrenRentStrategy().calculateRent(each);
                break;
        }
        return thisAmount;
    }

}
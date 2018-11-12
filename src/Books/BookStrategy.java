package Books;

/**
 * Class defined to implement the Strategy Pattern for calculating the rent and getting the purchase price dynamically at runtime based on the
 * input BookRental or BookPurchase parameter. This class strategizes the calculateRent and getPurchasePrice methods.
 */
public class BookStrategy {

    /**
     * Moved method from the original class to Strategy class created. Further factory pattern and polymorphism is applied to the method.
     */
    public double calculateRent(BookRental each) {
        // determine amounts for each line
        double thisAmount = 0.0;
        BookStrategy bookStrategy = new BookFactory().getBookRentStrategy(each);
        thisAmount = bookStrategy.calculateRent(each);
        return thisAmount;
    }

    /**
     * Added this method to fetch the purchase price. Further factory pattern and polymorphism are applied to this method.
     */
    public double getPurchasePrice(BookPurchase each){
        double thisAmount = 0.0;
        BookStrategy bookStrategy = new BookFactory().getBookPurchaseStrategy(each);
        thisAmount = bookStrategy.getPurchasePrice(each);
        return thisAmount;
    }
}
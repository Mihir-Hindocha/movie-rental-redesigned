package Books;

/**
 * Class inherits properties from BookStrategy. The class deals with calculating rent
 * and providing purchase price for children's movies.
 */
public class ChildrenStrategy extends BookStrategy {

    public static final double CHILDREN_BASE_PRICE = 1.5;
    public static final int CHILDREN_DURATION = 3;
    public static final double CHILDREN_VARIABLE_PRICE = 1.5;

    public static final double CHILDREN_PURCHASE_PRICE = 8;

    public double calculateRent(BookRental each) {
        double thisAmount = 0.0;
        thisAmount += CHILDREN_BASE_PRICE;
        if (each.getDaysRented() > CHILDREN_DURATION) {
            thisAmount += (each.getDaysRented() - CHILDREN_DURATION) * CHILDREN_VARIABLE_PRICE;
        }
        return thisAmount;
    }

    public double getPurchasePrice(BookPurchase each){
        return CHILDREN_PURCHASE_PRICE;
    }
}
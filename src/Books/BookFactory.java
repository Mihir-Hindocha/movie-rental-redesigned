package Books;

/**
 * Factory Class defined to create the appropriate object of the type of Regular, New Release or Children.
 */
public class BookFactory {

    /**
     * Factory method creates object of the appropriate subclass at runtime based on the BookRental Object passed as parameter.
     */
    public static BookStrategy getBookRentStrategy(BookRental each) {
        switch (each.getBook().getPriceCode()) {
            case Book.REGULAR:
                return new RegularStrategy();
            case Book.NEW_RELEASE:
                return new NewReleaseStrategy();
            case Book.CHILDREN:
                return new ChildrenStrategy();
        }
        return null;
    }

    /**
     * Factory method creates object of the appropriate subclass at runtime based on the BookPurchase Object passed as parameter.
     */
    public BookStrategy getBookPurchaseStrategy(BookPurchase each) {
        switch (each.getBook().getPriceCode()) {
            case Book.REGULAR:
                return new RegularStrategy();
            case Book.NEW_RELEASE:
                return new NewReleaseStrategy();
            case Book.CHILDREN:
                return new ChildrenStrategy();
        }
        return null;
    }
}

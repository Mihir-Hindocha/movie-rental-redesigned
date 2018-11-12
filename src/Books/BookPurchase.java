package Books;

/**
 * BookPurchase inherits from Book class and the user's request regarding purchase are completed using this class.
 * It acts as an interface as all the remaining work is done dynamically in the back end.
 */
public class BookPurchase extends Book {
    private Book book;

    /**
     * BookStrategy object created to call the methods using appropriate subclasses at runtime.
     */
    private BookStrategy bookStrategy = new BookStrategy();

    BookPurchase(Book book){
        this.book = book;
    }
    public Book getBook() {
        return book;
    }

    public double getPurchasePrice(){
        return new BookFactory().getBookPurchaseStrategy(this).getPurchasePrice(this);
    }
}

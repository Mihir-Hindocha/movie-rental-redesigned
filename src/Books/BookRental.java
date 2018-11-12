package Books;

/**
 * BookRental inherits from Book class and the user's request regarding rent are completed using this class.
 * It acts as an interface as all the remaining work is done dynamically in the back end.
 */
public class BookRental extends Book {
    private Book book;
    private int daysRented;
    /**
     * BookStrategy object created to call the methods using appropriate subclasses at runtime.
     */
    private BookStrategy bookStrategy = new BookStrategy();
    
    public BookRental(Book book, int daysRented) {
            this.book = book;
            this.daysRented = daysRented;
    }
    
    public int getDaysRented() {
        return daysRented;
    }
    
    public Book getBook() {
        return book;
    }

    public double calculateRent(){
        return new BookFactory().getBookRentStrategy(this).calculateRent(this);
    }

}
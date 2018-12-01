import Books.*;
import Movie.*;

/**
 * @author Mihir Hindocha - mxh170027
 * @since 11-11-2018
 * @version 2.0
 * REFACTORING in the Large and DESIGN FOR CHANGE
 * In this homework, you are required to come up with a solution better than your solution in homework 2 on the movie rental program to support new features in new requirements as follows:
 * 1. Your new program must support different types of items including movies, video games, music CDs and books. You should support different categories of movies, music CDs, DVDs, and books. You must anticipate other new types of items as well.
 * 2. Your new program must support not only renting, but also selling those items.
 * 3. You should provide basic functions to support renting and selling transactions for those items in the store.
 */
public class Application {
    public static void main(String[] args) {
        //Defining 2 Test Movies
        Movie m1 = new Movie("Movie1", 0, 2); //Regular Price Code
        Movie m2 = new Movie("Movie2", 1, 2); //New Release Price Code

        //Defining 2 MovieRental objects
        MovieRental r1 = new MovieRental(m1, 1); //Regular 1 day
        MovieRental r2 = new MovieRental(m2, 2); //New Release 2 days

        //Defining Customers
        Customer c1 = new Customer("Movie Customer1");

        //Add rentals to Movie Customer
        c1.addMovieRental(r1);
        c1.addMovieRental(r2);

        //Get the statement for Movie Customer
        System.out.println(c1.getStatement());
    }
}

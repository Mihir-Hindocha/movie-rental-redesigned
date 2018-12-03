package movie_rental;
import movie.*;

/**
 * @author Mihir Hindocha - mxh170027
 * @since 11-11-2018
 * @version 3.0
 * <Br/>
 * REFACTORING to Design PatternsIn this homework, you are required to use the code for the movie rental application and add the following features:
 * 1) You are required to modify the code to make the function of computing frequent rental points into a strategy design pattern 
 *    (That is, you will have strategy classes to compute frequent rental points).
 * 2) After create a strategy class for the current strategy to compute frequent rental points, you are required to add two new strategies:
 * 		a. The first new frequent rental point computation gives double regular points to any customer who is 
 * 		   renting more than two types of categories
 * 		b. The first new frequent rental point computation gives double regular points to any customer who is 
 * 		   18-22 and renting one or multiple new release movies.
 * 3) Please modify your code to add the following functionality: if a customer has 10 frequent renter points, 
 * 	  he will get a free movie rental of any type.
 */
public class Application {
    public static void main(String[] args) {
        //Defining 2 Test Movies
        Movie m1 = new Movie("Movie1", 0, 2); //Regular Price Code
        Movie m2 = new Movie("Movie2", 1, 2); //New Release Price Code

        //Defining 2 MovieRental objects
        MovieRental r1 = new MovieRental(m1, 1); //Regular 1 day
        MovieRental r2 = new MovieRental(m2, 2); //New Release 2 days
        MovieRental r3 = new MovieRental(m2, 2); //New Release 2 days
       
        //Defining Customers
        Customer c1 = new Customer("Movie Customer1",19);

        //Add rentals to Movie Customer
        c1.addMovieRental(r2);
        c1.addMovieRental(r1);
        c1.addMovieRental(r3);
       
        //Get the statement for Movie Customer
        System.out.println(c1.getStatement());
    }
}

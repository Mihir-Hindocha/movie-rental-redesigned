public class Application {
    public static void main(String[] args) {
        //Defining 2 Test Movies
        Movie m1 = new Movie("Movie1",0,2); //Regular Price Code
        Movie m2 = new Movie("Movie2",1,2); //New Release Price Code

        //Defining 2 MovieRental objects
        MovieRental r1 = new MovieRental(m1,1); //Regular 1 day
        MovieRental r2 = new MovieRental(m2,2); //New Release 2 days

        //Defining Customers
        Customer c1 = new Customer("Customer1");

        //Add rentals to Customer1
        c1.addRental(r1);
        c1.addRental(r2);

        //Get the statement for Customer1
    	System.out.println(c1.getStatement());
//        System.out.println(c1.printCustomerDetails());
    }
}

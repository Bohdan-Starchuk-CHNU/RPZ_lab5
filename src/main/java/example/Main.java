package example;

import java.util.List;

import static example.Movie.MovieType.*;

public class Main {
    public static final Movie REMBO = new Movie("Rembo", REGULAR);
    public static final Movie LOTR = new Movie("Lord of the Rings", NEW_RELEASE);
    public static final Movie HARRY_POTTER = new Movie("Harry Potter", CHILDRENS);

    public static void main(String[] args) {
        List<Rental> rentals = List.of(new Rental(REMBO, 1),
                new Rental(LOTR, 4),
                new Rental(HARRY_POTTER, 5));

        String statement = new Customer("John Doe", rentals).statement();

        System.out.println(statement);
    }
}

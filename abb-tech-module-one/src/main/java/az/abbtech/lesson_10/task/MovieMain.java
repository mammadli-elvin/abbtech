package az.abbtech.lesson_10.task;

public class MovieMain {
    public static void main(String[] args) {
        MovieLibrary library = MovieLibrary.getInstance();

        library.addMovie(new Movie("Inception", "Christopher Nolan", "Sci-Fi", 2010));
        library.addMovie(new Movie("The Dark Knight", "Christopher Nolan", "Action", 2008));
        library.addMovie(new Movie("Interstellar", "Christopher Nolan", "Sci-Fi", 2014));
        library.addMovie(new Movie("Parasite", "Bong Joon-ho", "Thriller", 2019));

        // Display all movies sorted by title
        System.out.println("Movies sorted by title:");
        library.displayMovies("title");

        // Search for movies by director
        System.out.println("\nMovies directed by Christopher Nolan:");
        library.searchMovies("Christopher Nolan", "director").forEach(System.out::println);

        System.out.printf("\nAverage release year: %.2f\n", library.calculateAverageReleaseYear());

        System.out.printf("\nNumber of movies: %d\n", library.countMovies());

        // Remove a movie and display updated library
        library.removeMovie("Inception");
        System.out.println("\nAfter removing 'Inception':");
        library.displayMovies("title");
    }
}

package az.abbtech.lesson_10.task;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MovieLibrary {
    private static final List<Movie> MOVIES = new ArrayList<>();

    private MovieLibrary() {

    }

    public static MovieLibrary getInstance() {
        return MovieLibraryHolder.INSTANCE;
    }

    private static class MovieLibraryHolder {
        private static final MovieLibrary INSTANCE = new MovieLibrary();
    }

    public void addMovie(Movie movie) {
        if (!MOVIES.contains(movie)) {
            MOVIES.add(movie);
        } else {
            System.out.println("Movie already exists: " + movie.getTitle());
        }
    }

    public boolean removeMovie(String title) {
        return MOVIES.removeIf(movie -> movie.getTitle().equalsIgnoreCase(title));
    }

    public List<Movie> searchMovies(String keyword, String searchBy) {
        return MOVIES.stream()
                .filter(movie -> {
                    return switch (searchBy.toLowerCase()) {
                        case "title" -> movie.getTitle().equalsIgnoreCase(keyword);
                        case "director" -> movie.getDirector().equalsIgnoreCase(keyword);
                        case "genre" -> movie.getGenre().equalsIgnoreCase(keyword);
                        default -> throw new IllegalArgumentException("Invalid searchBy parameter: " + searchBy);
                    };
                })
                .toList();
    }

    public void displayMovies(String sortingBy) {
        Comparator<Movie> comparator = switch (sortingBy) {
            case "title" ->
                    Comparator.comparing(Movie::getTitle); // (movie1, movie2) -> movie1.getTitle().compareTo(movie2.getTitle())
            case "director" -> Comparator.comparing(Movie::getDirector);
            case "release year" -> Comparator.comparing(Movie::getReleaseYear);
            default ->
                    throw new IllegalArgumentException("Invalid sort by: " + sortingBy + "\nSorting can be only by: title, director, release year");
        };
        MOVIES.stream()
                .sorted(comparator)
                .forEach(System.out::println);
    }

    public double calculateAverageReleaseYear() {
        return MOVIES.stream()
                .mapToInt(Movie::getReleaseYear)
                .average()
                .orElse(0);
    }

    public int countMovies() {
        return MOVIES.size();
    }
}

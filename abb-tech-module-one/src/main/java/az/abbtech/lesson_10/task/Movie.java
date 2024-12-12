package az.abbtech.lesson_10.task;

import java.util.Objects;

public class Movie {
    private String title;
    private String director;
    private String genre;
    private int releaseYear;

    public Movie(String title, String director, String genre, int releaseYear) {
        if (title != null && director != null && genre != null && releaseYear > 0) {
            this.title = title;
            this.director = director;
            this.genre = genre;
            this.releaseYear = releaseYear;
        }
    }

    public String getTitle() {
        return title;
    }

    public String getDirector() {
        return director;
    }

    public String getGenre() {
        return genre;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Movie movie)) return false;
        return getReleaseYear() == movie.getReleaseYear() && Objects.equals(getTitle(), movie.getTitle()) && Objects.equals(getDirector(), movie.getDirector()) && Objects.equals(getGenre(), movie.getGenre());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getTitle(), getDirector(), getGenre(), getReleaseYear());
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", genre='" + genre + '\'' +
                ", releaseYear=" + releaseYear +
                '}';
    }
}

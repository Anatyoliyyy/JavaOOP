package Lesson9.HomeWorke.Task2MovieYearFinder;

import java.util.List;

public interface MovieYearFinder {
    void add(Movie movie);
    List<Movie> findByReleaseYear(int releaseYear);
    List<Movie> findByReleaseYears(int minReleaseYear, int maxReleaseYear);
}

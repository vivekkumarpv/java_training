package com.stackroute.collections;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

/*
This class contains a property called movieMap of type Map
This class contains methods for adding key-value pairs of Movie and its rating to HashMap and
various methods for accessing the keys and values based on some conditions
 */
public class MovieService {
	Map<Movie, Integer> movieMap = new LinkedHashMap<>();

	/**
	 * Constructor to create movieMap as an empty LinkedHashMap object
	 */
	public MovieService() {
	}

	/*
	 * Returns the movieMap object
	 */
	public Map<Movie, Integer> getMovieMap() {

		return movieMap;
	}

	/*
	 * Add key-value pairs of Movie-Integer type and returns Set of Map.Entry
	 */
	public Set<Map.Entry<Movie, Integer>> addKeyValuePairsToMap(Movie movie, Integer rating) {
		movieMap.put(movie, rating);
		return movieMap.entrySet();
	}

	/*
	 * Return Set of movie names having rating greater than or equal to given rating
	 */
	public List<String> getHigherRatedMovieNames(int rating) {
		List<String> highRateMovies = new ArrayList<>();
		for (Movie m : movieMap.keySet()) {
			if (movieMap.get(m) >= rating) {
				highRateMovies.add(m.getMovieName());
			}
		}
		return highRateMovies;
	}

	/*
	 * Return Set of movie names belonging to specific genre
	 */
	public List<String> getMovieNamesOfSpecificGenre(String genre) {
		List<String> sameGenreMovies = new ArrayList<>();
		for (Movie m : movieMap.keySet()) {
			if (m.getGenre().equalsIgnoreCase(genre)) {
				sameGenreMovies.add(m.getMovieName());
			}
		}
		return sameGenreMovies;
	}

	/*
	 * Return Set of movie names which are released after Specific releaseDate and
	 * having rating less than or equal to 3
	 */

	public List<String> getMovieNamesReleasedAfterSpecificDateAndRatingLesserThanThree(LocalDate releaseDate) {
		List<String> selectedMovies = new ArrayList<>();
		for (Movie m : movieMap.keySet()) {
			if (movieMap.get(m) <= 3 && m.getReleaseDate().isAfter(releaseDate)) {
				selectedMovies.add(m.getMovieName());
			}
		}
		return selectedMovies;
	}

	/*
	 * Return set of movies sorted by release dates in ascending order. Hint: Use
	 * TreeMap
	 */
	public List<Movie> getSortedMovieListByReleaseDate() {
		List<Movie> data = new LinkedList<>();
		Comparator<Movie> com = (m1, m2) -> m1.getReleaseDate().compareTo(m2.getReleaseDate());
		TreeMap<Movie, Integer> sortedMovieList = new TreeMap<>(com);

		for (Movie mov : movieMap.keySet()) {

			sortedMovieList.put(mov, movieMap.get(mov));
		}

		for (Movie movie : sortedMovieList.keySet()) {
			data.add(movie);
		}
		return data;
	}

	/*
	 * Return set of movies sorted by rating. Hint: Use Comparator and LinkedHashMap
	 */
	public Map<Movie, Integer> getSortedMovieListByRating() {
		ArrayList<Entry<Movie, Integer>> movieData = new ArrayList<>(movieMap.entrySet());
		Collections.sort(movieData, (mov, mov2) -> {
			return ((Comparable) ((Map.Entry) (mov)).getValue()).compareTo(((Map.Entry) (mov2)).getValue());
		});
		HashMap data = new LinkedHashMap();
		Iterator it = movieData.iterator();
		while (it.hasNext()) {
			Map.Entry entry = (Map.Entry) it.next();
			data.put(entry.getKey(), entry.getValue());
		}
		return data;
	}
}

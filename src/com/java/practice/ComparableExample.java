package com.java.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Movie implements Comparable<Movie>{
	
	private String name;
	private int year;
	private double rating;
	
	public Movie(String name, int year, double rating) {
		this.name = name;
		this.year = year;
		this.rating = rating;
	}

	public String getName() {
		return name;
	}

	public int getYear() {
		return year;
	}

	public double getRating() {
		return rating;
	}

	@Override
	public int compareTo(Movie o) {
		return -(this.year - o.year);
	}
	
}

class NameComparator implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}

class RatingComparator implements Comparator<Movie>{

	@Override
	public int compare(Movie o1, Movie o2) {
		if(o1.getRating() < o2.getRating()) return 1;
		if(o1.getRating() > o2.getRating()) return -1;
		return 0;
	}
	
}

public class ComparableExample {

	public static void main(String[] args) {
		List<Movie> movies = new ArrayList<Movie>();
		movies.add(new Movie("MI-1", 1996, 7.6));
		movies.add(new Movie("MI-2", 2000, 6.5));
		movies.add(new Movie("MI-3", 2006, 7.3));
		movies.add(new Movie("MI-4", 2011, 7.8));
		
		Collections.sort(movies);
		System.out.println("Movies sorted in Natural order");
		for(Movie movie: movies){
			System.out.println(movie.getName()+":"+movie.getYear()+":"+movie.getRating());
		}
		
		Collections.sort(movies, new RatingComparator());
		System.out.println("Movies sorted in descending order of Rating");
		for(Movie movie: movies){
			System.out.println(movie.getName()+":"+movie.getYear()+":"+movie.getRating());
		}
	}

}

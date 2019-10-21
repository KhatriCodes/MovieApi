package com.example.model;

public class MovieApiModel {
	
	String MovieName;
	String Desc;
	int movierating;
	
	public MovieApiModel() {
		
	}
	
	
	
	public MovieApiModel(String movieName, String desc, int movierating) {
		super();
		MovieName = movieName;
		Desc = desc;
		this.movierating = movierating;
	}
	
	public String getMovieName() {
		return MovieName;
	}
	public void setMovieName(String movieName) {
		MovieName = movieName;
	}
	public String getDesc() {
		return Desc;
	}
	public void setDesc(String desc) {
		Desc = desc;
	}
	public int getMovierating() {
		return movierating;
	}
	public void setMovierating(int movierating) {
		this.movierating = movierating;
	}
	
	

}

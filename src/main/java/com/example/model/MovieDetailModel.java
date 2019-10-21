package com.example.model;

public class MovieDetailModel {

	String MovieName;
	String Desc;
	
	public MovieDetailModel() {}
		
	
	
	public MovieDetailModel(String movieName, String desc) {
		super();
		MovieName = movieName;
		Desc = desc;
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
	
	
	
}

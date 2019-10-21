package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.example.model.MovieApiModel;
import com.example.model.MovieDetailModel;
import com.example.model.Rating;


@RestController
public class MovieApiController {
	
	@Autowired
	RestTemplate rest;
	
	@Value("${MovieDetailApiUrl}")
	private String MovieDetailApiUrl;
	
	@Value("${RatingApiUrl}")
	private String RatingApiUrl;
	
	
	
	@RequestMapping("/MovieApi/{movieName}")
	public MovieApiModel finalCall(@PathVariable ("movieName") String movieName )
	{
		
		String finalMovieDetailApiUrl = MovieDetailApiUrl.concat("/"+movieName);
		String finalRatingApiUrl = RatingApiUrl.concat("/"+movieName);
		
		// Calling Movie Detail Microservice
		MovieDetailModel movieDetailModel = rest.getForObject(finalMovieDetailApiUrl, MovieDetailModel.class);
		
		// Calling Rating Microservice
		Rating rating = rest.getForObject(finalRatingApiUrl, Rating.class);
		
		//Concating result together in Movie Detail API
		return new MovieApiModel(movieDetailModel.getMovieName(),movieDetailModel.getDesc(),rating.getMovierating());
	}
	
	
	
	
}

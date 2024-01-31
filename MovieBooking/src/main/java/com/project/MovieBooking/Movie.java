package com.project.MovieBooking;

import jakarta.persistence.*;

@Entity
@Table(name = "Movie_Booking")
public class Movie {

	@Id
	Long movie_id;
	String movie_name;
	String movie_lang; 
	Long movie_duration;
	Double movie_rating;
	String movie_availability;
	
	public Long getMovie_id() {
		return movie_id;
	}
	public void setMovie_id(Long movie_id) {
		this.movie_id = movie_id;
	}
	public String getMovie_name() {
		return movie_name;
	}
	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}
	public String getMovie_lang() {
		return movie_lang;
	}
	public void setMovie_lang(String movie_lang) {
		this.movie_lang = movie_lang;
	}
	public Long getMovie_duration() {
		return movie_duration;
	}
	public void setMovie_duration(Long movie_duration) {
		this.movie_duration = movie_duration;
	}
	public Double getMovie_rating() {
		return movie_rating;
	}
	public void setMovie_rating(Double movie_rating) {
		this.movie_rating = movie_rating;
	}
	public String getMovie_availability() {
		return movie_availability;
	}
	public void setMovie_availability(String movie_availability) {
		this.movie_availability = movie_availability;
	}
	
}

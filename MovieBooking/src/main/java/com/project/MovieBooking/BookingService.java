package com.project.MovieBooking;
import java.util.*;
import org.springframework.beans.factory.annotation.*;
import org.springframework.stereotype.Component;

@Component
public class BookingService {

	@Autowired
	BookingRepository bookingRepository;
	
	public String create(Movie movie)
	{
		bookingRepository.save(movie);
		return "Movie added Successfully";
	}
	
	public List<Movie> getAll()
	{
		return bookingRepository.findAll();
	}
	
	public Optional getById(Long id)
	{
		Optional<Movie> movie = bookingRepository.findById(id);
		if(movie.isPresent())
		{
			return movie;
		}
		return null;
	}
	
	public String deleteById(Long id)
	{
		Optional<Movie> movie = bookingRepository.findById(id);
		if(movie.isPresent())
		{
			bookingRepository.deleteById(id);
		}
		return "Movie deleted Successfully";
	}
	
	public Movie updateMovie(Long id,Movie movie)
	{
		Optional<Movie> optionalMovie = bookingRepository.findById(id);
		if(optionalMovie.isPresent())
		{
			Movie existingMovie = optionalMovie.get();
			existingMovie.setMovie_id(movie.getMovie_id());
			existingMovie.setMovie_name(movie.getMovie_name());
			existingMovie.setMovie_lang(movie.getMovie_lang());
			existingMovie.setMovie_duration(movie.getMovie_duration());
			existingMovie.setMovie_rating(movie.getMovie_rating());
			existingMovie.setMovie_availability(movie.getMovie_availability());
			return bookingRepository.save(existingMovie);
		}
		return null;
	}
}

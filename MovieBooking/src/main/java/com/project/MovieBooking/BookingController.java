package com.project.MovieBooking;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.*;
@RestController
@RequestMapping("/booking")
public class BookingController {
	
	@Autowired
	BookingService bookingService;
	
	@PostMapping("/addMovie")
	public String create(@RequestBody Movie movie)
	{
		return bookingService.create(movie);
	}
	
	@GetMapping("/getAll")
	public List<Movie> getAll()
	{
		return bookingService.getAll();
	}
	@GetMapping("get/{id}")
	public Optional getById(@PathVariable Long id)
	{
		return bookingService.getById(id);
	}
	
	@DeleteMapping("/remove/{id}")
	public String deleteById(@PathVariable Long id)
	{
		return bookingService.deleteById(id);
	}
	
	@PutMapping("/update/{id}")
	public Movie updateMovie(@PathVariable Long id,@RequestBody Movie movie)
	{
		return bookingService.updateMovie(id, movie);
	}
}

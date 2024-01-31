package com.project.MovieBooking;
import org.springframework.stereotype.Component;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@Component
public interface BookingRepository extends JpaRepository<Movie, Long> {

}

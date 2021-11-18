package com.multiplex.bookingsystem.movies.movierepository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.multiplex.bookingsystem.movies.entity.Movies;


public interface MovieRepository extends JpaRepository<Movies, Integer> {

	public Movies getMovieByMovieName(String movieName);

	

	

}

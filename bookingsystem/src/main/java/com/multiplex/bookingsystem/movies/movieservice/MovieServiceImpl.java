package com.multiplex.bookingsystem.movies.movieservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.multiplex.bookingsystem.movies.entity.Movies;
import com.multiplex.bookingsystem.movies.entity.Shows;
import com.multiplex.bookingsystem.movies.movierepository.MovieRepository;
import com.multiplex.bookingsystem.movies.movierepository.ShowRepository;

@Service
public class MovieServiceImpl  implements MovieService{
	@Autowired
	public MovieRepository rep;
	@Autowired 
	public ShowRepository showRep;

	@Override
	public void addMovies(Movies movies) {
		
		rep.save(movies);
		
	}

	@Override
	public List<Movies> getMovies() {
		
		return rep.findAll();
	}

	@Override
	public Movies getMovieByName(String movieName) {
		
		return rep.getMovieByMovieName(movieName);
	}

	@Override
	public Shows getShowByName(String showName) {
		
		return showRep.getShowByShowName(showName);
	}

	
           
}


package com.driver;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Service
public class MovieService {

    @Autowired
    MovieRepository movieRepository;

    public String addMovie(Movie movie)
    {
        return movieRepository.addMovie(movie);
    }
    public String addDirector(Director director)
    {
        return movieRepository.addDirector(director);
    }
    public String addMovieDirectorPair(String nameM,String nameD)
    {
        return movieRepository.addMovieDirectorPair(nameM,nameD);
    }
    public Movie getMovieByName(String nameM)
    {
        return movieRepository.getMovieByName(nameM);
    }
    public Director getDirectorByName(String nameD)
    {
        return movieRepository.getDirectorByName(nameD);
    }
    public List<String> getMoviesByDirectorName(String nameD)
    {
        return movieRepository.getMoviesByDirectorName(nameD);
    }
    public List<String> findAllMovies()
    {
        return movieRepository.findAllMovies();
    }
    public String deleteDirectorByName(String nameD)
    {
        return movieRepository.deleteDirectorByName(nameD);
    }
    public String deleteAllDirectors()
    {
        return movieRepository.deleteAllDirectors();
    }



}
























//package com.driver;
//import java.util.*;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import javax.swing.*;
//
//@Service
//public class MovieService {
//
//    @Autowired
//    MovieRepository repo;
//
//    public String addMovie(Movie movie){
//            return repo.addmovie(movie);
//    }
//
//    public String addDirector(Director dir){
//        return repo.addir(dir);
//    }
//
//    public String addDirMovPair(String movie,String director ){
//        return repo.addPairMovieDir(movie,director);
//    }
//
//    public Movie getmovie(String name){
//        return repo.getMovie(name);
//    }
//
//    public Director getdirector(String name){
//        return repo.getDirector(name);
//    }
//    public List<String> findMoviesFromDirector(String director){
//        return repo.getMoviesByDirector(director);
//    }
//
//    public List<String> findAllMovies(){
//        return repo.AllMovie();
//    }
//
//    public String deleteDirector(String director){
//        return repo.deleteDirector(director);
//    }
//
//    public String deleteAllDirectors(){
//        return repo.deleteAllDirector();
//    }
//
//
//
//
//
//
//
//
//}

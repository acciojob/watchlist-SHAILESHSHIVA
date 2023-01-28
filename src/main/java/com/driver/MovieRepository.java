package com.driver;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@Repository
public class MovieRepository {

    HashMap<String,Movie>Mdb=new HashMap<>();
    HashMap<String,Director>Ddb=new HashMap<>();
    HashMap<String, List<String>>Pdb=new HashMap<>();

    public String addMovie(Movie movie)
    {
        String name=movie.getName();
        Mdb.put(name,movie);
        return "Movie added successfully";
    }
    public String addDirector(Director director)
    {
        String name=director.getName();
        Ddb.put(name,director);
        return "Director added successfully";
    }
    public String addMovieDirectorPair(String nameM,String nameD) {
        if(!Mdb.containsKey(nameM) || !Ddb.containsKey(nameD)) return "Movie or Director not found in database";
        List<String>ml = Pdb.getOrDefault(nameD, new ArrayList<>());
        if(ml.contains(nameM)) return "Pair already exists";
        ml.add(nameM);
        Pdb.put(nameD,ml);
        return "Pair added successfully";
    }
    public Movie getMovieByName(String nameM)
    {
        if(Mdb.containsKey(nameM))
        {
            return Mdb.get(nameM);
        }
        return null ;
    }
    public Director getDirectorByName(String nameD)
    {
        if(Ddb.containsKey(nameD))
        {
            return Ddb.get(nameD);
        }
        return null;
    }
    public List<String> getMoviesByDirectorName(String nameD)
    {
        if(Pdb.containsKey(nameD))
        {
            return Pdb.get(nameD);
        }
        return null;
    }
    public List<String> findAllMovies()
    {
        List<String>allmovie=new ArrayList<>();
        for(String m:Mdb.keySet())
        {
            allmovie.add(m);
        }
        return allmovie;
    }
    public String deleteDirectorByName(String nameD)
    {
        List<String>ml=new ArrayList<>();
        if(Pdb.containsKey(nameD))
        {
            ml=Pdb.get(nameD);
        }
        for(String movie:ml)
        {
            if(Mdb.containsKey(movie))
            {
                Mdb.remove(movie);
            }
        }
        Pdb.remove(nameD);
        if(Ddb.containsKey(nameD))
        {
            Ddb.remove(nameD);
        }
        return "Director and its movies removed successfully";
    }
    public String deleteAllDirectors()
    {
        for(String D:Pdb.keySet())
        {
            List<String>dml=new ArrayList<>();
            dml=Pdb.get(D);
            for(String movie:dml)
            {
                if(Mdb.containsKey(movie))
                {
                    Mdb.remove(movie);
                }
            }
            Pdb.remove(D);
        }
        for(String D:Ddb.keySet())
        {
            Ddb.remove(D);
        }
        return "All directors and all of their movies removed successfully";

    }


}









































//package com.driver;
//
//import org.springframework.stereotype.Repository;
//
//import java.util.*;
//
//@Repository
//
//public class MovieRepository {
//
//    Map<String,Movie> mMap = new HashMap<>();
//    Map<String,Director> dMap = new HashMap<>();
//
//    Map<String,List<String>> pMap = new HashMap<>();
//
//    public String addmovie(Movie movie){
//        mMap.put(movie.getName(), movie);
//        return "Movie Added";
//    }
//
//    public String addir(Director dir){
//        dMap.put(dir.getName(), dir);
//
//        return "Dircetor Added";
//    }
//
//    public String addPairMovieDir(String mvName,String dirName){
//        if(!mMap.containsKey(mvName) || !dMap.containsKey(dirName)) return "movie and director not found..";
//         List<String> lst = pMap.getOrDefault(dirName,new ArrayList<>());
//         if(lst.contains(mvName)) return "Already there in db ";
//         lst.add(mvName);
//         pMap.put(dirName,lst);
//
//         return "Pair Added";
//    }
//
//    public Movie getMovie(String name){
//
//        return mMap.get(name);
//
//    }
//
//    public Director getDirector(String dir){
//
//        return dMap.get(dir);
//
//    }
//
//        public List<String> getMoviesByDirector(String dir){
//        List<String> mlst = new ArrayList<>();
//        if(pMap.containsKey(dir)) mlst = pMap.get(dir);
//        return mlst;
//
//    }
//
//    public List<String> AllMovie(){
//        return new ArrayList<>(mMap.keySet());
//    }
//
//
//    public String deleteDirector(String dir){
//        List<String> movies = new ArrayList<String>();
//        if(pMap.containsKey(dir)){
//            movies = pMap.get(dir);
//            for(String movie: movies){
//                if(mMap.containsKey(movie)){
//                    mMap.remove(movie);
//                }
//            }
//
//            pMap.remove(dir);
//        }
//
//        if(dMap.containsKey(dir)){
//            dMap.remove(dir);
//        }
//
//        return "Director and movies removed";
//    }
//
//    public String deleteAllDirector(){
//        HashSet<String> moviesSet = new HashSet<String>();
//
//        //directorMap = new HashMap<>();
//
//        for(String director: pMap.keySet()){
//            for(String movie: pMap.get(director)){
//                moviesSet.add(movie);
//            }
//
//            pMap.remove(director);
//            dMap.remove(director);
//        }
//
//        for(String movie: moviesSet){
//            if(mMap.containsKey(movie)){
//                mMap.remove(movie);
//            }
//        }
//
//        return "All directors removed";
//    }
//
//
//
//
//
//}

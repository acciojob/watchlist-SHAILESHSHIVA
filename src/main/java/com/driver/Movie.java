package com.driver;

public class Movie {

    private String name;
    private int getDurationInMinutes;
    double getImdbRating;

    public  Movie(){

    }

    public Movie(String name,int getDurationInMinutes,double getImdbRating ) {
        this.name = name;
        this.getDurationInMinutes = getDurationInMinutes;
        this.getImdbRating = getImdbRating;
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getGetDurationInMinutes() {
        return getDurationInMinutes;
    }

    public void setGetDurationInMinutes(int getDurationInMinutes) {
        this.getDurationInMinutes = getDurationInMinutes;
    }

    public double getGetImdbRating() {
        return getImdbRating;
    }

    public void setGetImdbRating(double getImdbRating) {
        this.getImdbRating = getImdbRating;
    }






}

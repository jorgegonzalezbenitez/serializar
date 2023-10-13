package org.example.model;

public class Movie {
    private String director;
    private String name_movie;
    private int duration;

    public Movie(String director, String name_movie, int duration) {
        this.director = director;
        this.name_movie = name_movie;
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getName_movie() {
        return name_movie;
    }

    public void setName_movie(String name_movie) {
        this.name_movie = name_movie;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}

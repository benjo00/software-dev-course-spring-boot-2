package com.example.mycollections.models;

public class Movie extends LibraryItem {
    private String director;
    private int duration;

    public Movie(String name, String director, int year, int duration) {
        super(name, year);
        this.director = director;
        this.duration = duration;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}

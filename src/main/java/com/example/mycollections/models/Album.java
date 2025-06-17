package com.example.mycollections.models;

public class Album extends LibraryItem {
    private String artist;
    private int duration;

    public Album(String name, String artist, int year, int duration) {
        super(name, year);
        this.artist = artist;
        this.duration = duration;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}

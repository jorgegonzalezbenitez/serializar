package org.example.model;

public class Session {
    private int day;
    private int hour;
    private int minute;
    private final Movie movie;
    private final Theater theater;

    public Session(int day, int hour, int minute, Movie movie, Theater theater) {
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.movie = movie;
        this.theater = theater;
    }

    public int getDay() {
        return day;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public Movie getMovie() {
        return movie;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }
}

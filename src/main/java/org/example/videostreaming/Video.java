package org.example.videostreaming;

public abstract class Video {
    private String title;
    private int duration; // en minutos

    public Video(String title, int duration) {
        this.title = title;
        this.duration = duration;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public int getDuration() {
        return duration;
    }

    public String getInfo() {
        return "Title: " + title + ", Duration: " + duration + " minutes";
    }
}
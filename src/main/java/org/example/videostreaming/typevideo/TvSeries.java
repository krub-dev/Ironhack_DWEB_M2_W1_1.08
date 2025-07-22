package org.example.videostreaming.typevideo;
import org.example.videostreaming.Video;

public class TvSeries extends Video {
    private int episodes;

    public TvSeries(String title, int duration, int episodes) {
        super(title, duration);
        this.episodes = episodes;
    }

    public int getEpisodes() {
        return episodes;
    }

    @Override
    public String getInfo() {
        return super.getInfo() + ", Episodes: " + episodes;
    }
}
package com.gabrielsmm.gof.estruturais.flyweight.musicPlayer.musicFlyweight;

public class MusicFlyweight {

    // Dados intrínsecos
    private String name;
    private String artist;
    private Integer durationInSeconds;

    public MusicFlyweight(String name, String artist, Integer durationInSeconds) {
        this.name = name;
        this.artist = artist;
        this.durationInSeconds = durationInSeconds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public Integer getDurationInSeconds() {
        return durationInSeconds;
    }

    public void setDurationInSeconds(Integer durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    @Override
    public String toString() {
        return "MusicFly [name=" + name + ", artist=" + artist
                + ", durationInSeconds=" + durationInSeconds + "]";
    }

}

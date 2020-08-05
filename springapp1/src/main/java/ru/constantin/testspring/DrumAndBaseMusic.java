package ru.constantin.testspring;

import java.util.ArrayList;
import java.util.List;

public class DrumAndBaseMusic implements Music{
    List<String> songs = new ArrayList<>();

    public DrumAndBaseMusic(List<String> songs) {
        this.songs.add("First Drum music");
        this.songs.add("Second Drum music");
        this.songs.add("Third Drum music");
    }

    @Override
    public List getSong() {
        return songs;
    }
}

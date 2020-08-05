package ru.constantin.testspring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class RockMusic implements Music{
    List<String> songs = new ArrayList<>();

    public RockMusic(List<String> songs) {
        this.songs.add("First RockMusic music");
        this.songs.add("Second RockMusic music");
        this.songs.add("Third RockMusic music");
    }

    @Override
    public List getSong() {
        return songs;
    }
}

package ru.constantin.testspring;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ClassicalMusic implements Music {
    List<String> songs = new ArrayList<>();

    public ClassicalMusic(List<String> songs) {
        this.songs.add("First classical music");
        this.songs.add("Second classical music");
        this.songs.add("Third classical music");
    }

    @Override
    public List getSong() {
        return songs;
    }
}

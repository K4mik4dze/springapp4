package ru.constantin.testspring;

import org.springframework.stereotype.Component;

public class RockMusic implements Music{
    String song;

    public RockMusic() {
        this.song = "First RockMusic music";
    }

    @Override
    public String getSong() {
        return song;
    }
}

package ru.constantin.testspring;

import org.springframework.stereotype.Component;

public class DrumAndBaseMusic implements Music{
    String song;

    public DrumAndBaseMusic() {
        this.song = "First Drum music";
    }

    @Override
    public String getSong() {
        return song;
    }
}

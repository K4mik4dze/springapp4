package ru.constantin.testspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.*;

public class MusicPlayer {

    @Value("${musicPlayer.name}")
    private String name;

    @Value("${musicPlayer.volume}")
    private int volume;
    private Music music1;
    private Music music2;
    private List<Music> listGenre;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    public MusicPlayer(ListGenre listGenre) {
        this.listGenre = listGenre.getList();
    }

    public String playMusic() {
        Random random = new Random();
        int i = random.nextInt(3);
        System.out.println(i);
        return "Playing: " + listGenre.get(i).getSong();
    }
}

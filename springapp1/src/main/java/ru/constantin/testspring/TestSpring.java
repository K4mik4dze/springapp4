package ru.constantin.testspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        );

        ClassicalMusic classicalMusic = context.getBean("musicBean", ClassicalMusic.class);
        System.out.println(classicalMusic.getSong());

//        ClassicalMusic classicalMusic2 = context.getBean("musicBean", ClassicalMusic.class);
//        System.out.println(classicalMusic2.getSong());


//        Music music = context.getBean("musicBean", Music.class);
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//        MusicPlayer firstMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        firstMusicPlayer.playMusic();
//        secondMusicPlayer.playMusic();
//        System.out.println(firstMusicPlayer == secondMusicPlayer);
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        firstMusicPlayer.setVolume(13);
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());

//        System.out.println("Player name = " + musicPlayer.getName());
//        System.out.println("Player volume = " + musicPlayer.getVolume());
        context.close();
    }
}

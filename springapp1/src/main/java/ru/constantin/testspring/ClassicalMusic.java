package ru.constantin.testspring;

public class ClassicalMusic implements Music {
    private ClassicalMusic() {}

    public static ClassicalMusic getClassicalMusic (){
        return new ClassicalMusic();
    }

    public void doMyInit() {
        System.out.println("do my initialization");
    }

    public void doMyDestroy() {
        System.out.println("doing my destraction");
    }

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }
}

package ru.anna.musicPlayer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class MusicPlayer { //применяем инверсию управления IoC
    //@Autowired - внедряем зависимость через поле
    private ClassicalMusic classicalMusic;

    //@Autowired - внедряем бин классической музыки через конструктор
    public MusicPlayer(ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
    }
    //@Autowired - внедряем бин через сеттер
    public void setClassicalMusic(ClassicalMusic classicalMusic) {
        this.classicalMusic = classicalMusic;
    }


    public String playMusic() {
        return ("Играет - " + classicalMusic.getSong());
    }

}

package ru.anna.musicPlayer;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml"
        ); //запуск файла
//         MusicPlayer musicPlayer = classPathXmlApplicationContext.getBean("musicPlayer",MusicPlayer.class);
//         musicPlayer.playMusic();

        Computer computer = classPathXmlApplicationContext.getBean("computer",Computer.class);
        System.out.println(computer);

        classPathXmlApplicationContext.close();
    }
}

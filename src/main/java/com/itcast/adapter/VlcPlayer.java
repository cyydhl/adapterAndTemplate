package main.java.com.itcast.adapter;

/**
 * Created by chenyingying on 2019/3/17.
 */
public class VlcPlayer implements AdvancedMediaPlayer{

    public void playVlc(String fileName) {
        System.out.println("Playing vlc file. Name: "+ fileName);
    }

    public void playMp4(String fileName) {

    }
}

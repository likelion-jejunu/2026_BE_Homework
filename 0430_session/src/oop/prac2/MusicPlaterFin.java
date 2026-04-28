package oop.prac2;

public class MusicPlaterFin {
    public static void main(String[] args) {
        MusicPlayer player = new MusicPlayer();

        player.on();
        player.volumeUp();
        player.volumeUp();
        player.volumeDown();

        player.setVolume(10);

        player.showStatus();
        player.off();
    }
}
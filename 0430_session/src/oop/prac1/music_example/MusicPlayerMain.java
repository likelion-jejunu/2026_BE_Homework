package oop.prac1.music_example;

public class MusicPlayerMain {
    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();

        on(data);
        off(data);
        volumeUp(data);
        volumeDown(data);
        showStatus(data);

    }
    static void on(MusicPlayerData data){
        data.isOn = true;
    }
    static void off(MusicPlayerData data){
        data.isOn = false;
    }
    static void volumeUp(MusicPlayerData data){
        data.volume += 1;
    }
    static void volumeDown(MusicPlayerData data){
        data.volume -= 1;
    }
    static void showStatus(MusicPlayerData data){
        System.out.println("음악 플레이어 상태 확인");
        if(data.isOn){
            System.out.println("음악 플레이어 ON, 볼륨: "+data.volume);
        }else{
            System.out.println("음악 플레이어 OFF");
        }
    }
}
package oop.prac1.music_example;

public class MusicPlayerPractice {

    public static void main(String[] args) {

        int volume = 0;
        boolean isOn = false;

        // 음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        // 볼륨 증가
        volume += 1;
        System.out.println("음악 플레이어 볼륨:" + volume);

        volume += 1;
        System.out.println("음악 플레이어 볼륨:" + volume);

        // 볼륨 감소
        volume -= 1;
        System.out.println("음악 플레이어 볼륨:" + volume);

        // 음악 플레이어 상태 확인
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + volume);
        } else {
            System.out.println("음악 플레이어 OFF, 볼륨:" + volume);
        }

        // 음악 플레이어 끄기
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
package prac02.interface_ex;

public interface Playable {
    void play();

    default void playStart() {
        System.out.println("놀이를 시작합니다.");
    }
}

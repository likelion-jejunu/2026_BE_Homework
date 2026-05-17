package prac01.polymorphism2.polymorphism;

public interface Playable {
    void play();

    default void hello(){
        System.out.println("안녕하세요.");
    }
}

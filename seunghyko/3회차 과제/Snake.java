package prac01.polymorphism2.polymorphism;

class Snake extends Animal implements Playable{
    @Override
    void feed() { System.out.println("뱀에게 쥐를 준다"); }

    @Override
    void clean() {
        System.out.println("뱀 테라리움을 소독한다.");
    }

    @Override
    public void play() {
        System.out.println("뱀이 논다.");
    }
}
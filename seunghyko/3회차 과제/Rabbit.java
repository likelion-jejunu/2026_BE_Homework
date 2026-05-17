package prac01.polymorphism2.polymorphism;

class Rabbit extends Animal implements Playable{
    @Override
    void feed() { System.out.println("토끼에게 풀을 준다"); }

    @Override
    void clean() {
        System.out.println("토끼 우리를 건초로 청소한다.");
    }

    @Override
    public void play() {
        System.out.println("토끼가 논다.");
    }
}

package prac01.polymorphism2.polymorphism;

class Seal extends Animal implements Playable{
    @Override
    void feed() { System.out.println("물개에게 생선을 준다"); }

    @Override
    void clean() {
        System.out.println("물개 수조를 물로 청소한다.");
    }

    @Override
    public void play() {
        System.out.println("물개가 논다.");
    }
}

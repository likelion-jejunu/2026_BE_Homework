package prac02.interface_ex;

class Rabbit extends Animal implements Playable {
    @Override
    public void feed() {
        System.out.println("토끼에게 풀을 준다");
    }

    @Override
    public void clean() {
        System.out.println("토끼 우리를 건초로 청소한다");
    }

    @Override
    public void play() {
        System.out.println("토끼가 공을 가지고 논다");
    }
}

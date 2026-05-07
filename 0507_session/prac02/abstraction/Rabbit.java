package prac02.abstraction;

class Rabbit extends Animal {
    @Override
    void feed() {
        System.out.println("토끼에게 풀을 준다");
    }

    @Override
    void clean() {
        System.out.println("토끼 우리를 건초로 청소한다");
    }
}

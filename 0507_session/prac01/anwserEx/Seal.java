package prac01.anwserEx;

class Seal extends Animal {
    @Override
    void feed() { System.out.println("물개에게 생선을 준다"); }

    @Override
    void clean() { System.out.println("물개 수조를 물로 청소한다"); }
}

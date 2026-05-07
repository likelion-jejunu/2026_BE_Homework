package prac02.interface_ex;

class Seal extends Animal implements Playable {
    @Override
    public void feed() {
        System.out.println("물개에게 생선을 준다");
    }

    @Override
    public void clean() {
        System.out.println("물개 수조를 물로 청소한다");
    }

    @Override
    public void play(){
        System.out.println("물개가 물놀이를 한다");
    }
}

package prac02.interface_ex;

class Snake extends Animal implements Playable {
    @Override
    public void feed() {
        System.out.println("뱀에게 쥐를 준다");
    }

    @Override
    public void clean(){
        System.out.println("뱀 테라리움을 소독한다");
    }

    @Override
    public void play() {
        System.out.println("뱀이 나뭇가지를 타고 논다");
    }
}
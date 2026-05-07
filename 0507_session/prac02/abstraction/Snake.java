package prac02.abstraction;

class Snake extends Animal {
    @Override
    void feed() {
        System.out.println("뱀에게 쥐를 준다");
    }

    @Override
    void clean(){
        System.out.println("뱀 테라리움을 소독한다");
    }
}
package prac01.overriding;

class Animal {
    void eat() { System.out.println("먹는다"); }
}

class Dog extends Animal {
    @Override
    void eat() { System.out.println("강아지가 사료를 먹는다"); }
}

class Cat extends Animal {
    @Override
    void eat() { System.out.println("고양이가 생선을 먹는다"); }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();  // 강아지가 사료를 먹는다

        Cat cat = new Cat();
        cat.eat();  // 고양이가 생선을 먹는다
    }
}
package prac01.overridingOrOverloading;

class Animal {
    void eat() { System.out.println("먹는다"); }
}

class Dog extends Animal {
    // 오버라이딩: 부모 메서드 재정의
    @Override
    void eat() { System.out.println("사료를 먹는다"); }

    // 오버로딩: 이름 같고 매개변수 다름
    void eat(String food) { System.out.println(food + "를 먹는다"); }

    // 오버로딩: 매개변수 타입이 다름
    void eat(int count) { System.out.println(count + "번 먹는다"); }
}

public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.eat();        // 오버라이딩 → 사료를 먹는다
        dog.eat("간식");  // 오버로딩  → 간식를 먹는다
        dog.eat(3);       // 오버로딩  → 3번 먹는다
    }
}
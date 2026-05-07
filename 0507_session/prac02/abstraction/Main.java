package prac02.abstraction;

public class Main {
    public static void main(String[] args) {
        Zookeeper keeper = new Zookeeper();

        // Animal animal = new Animal(); // 추상클래스 생성 불가!

        Animal animal[] = {new Rabbit(), new Seal(), new Snake()};

        for(Animal a: animal){
            keeper.feedAnimal(a);
            keeper.cleanAnimal(a);
        }
    }
}

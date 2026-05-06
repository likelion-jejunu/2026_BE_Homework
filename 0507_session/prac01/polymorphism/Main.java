package prac01.polymorphism;

public class Main {
    public static void main(String[] args) {
        Zookeeper keeper = new Zookeeper();

        keeper.feedAnimal(new Rabbit());
        keeper.feedAnimal(new Seal());
        keeper.feedAnimal(new Snake());
    }
}

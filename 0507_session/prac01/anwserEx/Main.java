package prac01.anwserEx;

public class Main {
    public static void main(String[] args) {
        Zookeeper keeper = new Zookeeper();

        Animal[] animals = {
                new Rabbit(),
                new Seal(),
                new Snake()
        };

//        keeper.feedAnimal(new Rabbit());
//        keeper.feedAnimal(new Seal());
//        keeper.feedAnimal(new Snake());


        System.out.println("===== 먹이주기 =====");
        for (Animal animal : animals) {
            keeper.feedAnimal(animal);
        }

        //for 문을 이렇게 쓰거나
//        for (int i = 0; i < animals.length; i++) {
//            keeper.feedAnimal(animals[i]);
//        }

        //while로도 할 수 있어요
//        int i = 0;
//        while (i < animals.length) {
//            keeper.feedAnimal(animals[i]);
//            i++;
//        }

        System.out.println("\n===== 청소하기 =====");
        for (Animal animal : animals) {
            keeper.cleanCage(animal);
        }
    }
}
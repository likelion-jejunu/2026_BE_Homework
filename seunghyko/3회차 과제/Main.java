package prac01.polymorphism2.polymorphism;

public class Main {
    public static void main(String[] args) {
        Zookeeper keeper = new Zookeeper();

//        keeper.feedAnimal(new Rabbit());
//        keeper.feedAnimal(new Seal());
//        keeper.feedAnimal(new Snake());

        Animal[] animals = {
                new Rabbit(),
                new Seal(),
                new Snake()
        };  //다형성

        for(Animal animal : animals){
            keeper.feedAnimal(animal);
            keeper.cleanCage(animal);
            keeper.playAnimal(animal);
    //Animal은 Playable을 모르는데 어떻게 접근하는가. (형변환)
            
        }
    }
}

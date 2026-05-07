package prac02.abstraction;

class Zookeeper {
    void feedAnimal(Animal animal) {
        animal.feed();
    }
    void cleanAnimal(Animal animal) { animal.clean(); }
}

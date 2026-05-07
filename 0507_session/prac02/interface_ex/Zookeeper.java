package prac02.interface_ex;

class Zookeeper {
    void feedAnimal(Animal animal) {
        animal.feed();
    }
    void cleanAnimal(Animal animal) { animal.clean(); }
    void playAnimal(Playable playable) { playable.play(); }
    void play(Playable playable) { playable.playStart(); }
}

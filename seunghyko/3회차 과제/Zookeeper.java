package prac01.polymorphism2.polymorphism;

class Zookeeper{
    void feedAnimal(Animal animal) {
        animal.feed();
    }

    void cleanCage(Animal animal){
        animal.clean();
    }

    void playAnimal(Animal animal) {
        ((Playable) animal).play();
    }

    // ❌ 1번: Playable.play();
    // 자바: "Playable은 인터페이스(개념)인데 누가 놀라는 거야? 실체가 없잖아!"

    // ❌ 2번: animal.play();
    // 자바: "너 지금 Animal 리모컨 들고 있잖아. 거기엔 play 버튼이 없어!"

    // ⭕ 정답: ((Playable) animal).play();
    // 자바: "아하! 이 animal(토끼)을 잠시 Playable 리모컨으로 바꾼 다음에,
    // 그 리모컨에 있는 play 버튼을 누르겠다는 거구나. 오케이!"

    //힌트 : 형 변환,  왜 되는지를 TIL
}

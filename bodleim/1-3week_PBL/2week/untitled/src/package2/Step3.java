package package2;

import package1.Lion;

public class Step3 {
    public static void main(String[] args) {
        Lion lion = new Lion("백두", "컴퓨터공학", 13);

        System.out.println("[초기 정보]");
        lion.printInfo();

        // 1. public 필드: 다른 패키지에서도 접근 가능
        lion.name = "한라";
        System.out.println("\nname 변경 후:");
        System.out.println("name = " + lion.name);

        // 2. default 필드: 다른 패키지에서는 접근 불가
        // lion.major = "AI";
        // 컴파일 오류 발생:
        // The field Lion.major is not visible

        // 3. private 필드: 직접 접근 불가
        // lion.generation = 14;
        // 컴파일 오류 발생:
        // The field Lion.generation is not visible

        // private 필드는 public 메서드를 통해 간접 접근 가능
        lion.setGeneration(14);

        System.out.println("\n[최종 정보]");
        lion.printInfo();
    }
}
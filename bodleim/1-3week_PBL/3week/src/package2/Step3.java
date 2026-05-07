package package2;

import package1.Lion;

public class Step3 {
    public static void main(String[] args) {
        Lion lion = new Lion("준", "컴퓨터공학", 13);

        System.out.println("[Step 3] 다른 패키지에서 필드 접근 확인");
        System.out.println("초기 상태");
        lion.printInfo();

        lion.name = "변경된 이름";

        System.out.println("public 필드 name 수정 후");
        lion.printInfo();
    }
}

package PBL2.package2;

import PBL2.package1.Lion;

public class step3 {
    public static void main(String[] args) {
        Lion lion = new Lion("김멋대", "컴퓨터공학과", 14);

        System.out.println("아기사자 객체를 생성합니다.");
        System.out.println("아기사자 정보를 출력합니다.");
        lion.printInfo();

        // Step 3-1: public 필드 접근
        System.out.println("Step 3-1. public 필드 접근을 시도합니다.");
        System.out.println("name 필드 값을 변경합니다.");
        lion.name = "홍길동";
        System.out.println("public 필드 접근 성공");
        System.out.println("아기사자 정보를 출력합니다.");
        lion.printInfo();

        // Step 3-2: default 필드 접근 시도 → 컴파일 에러
        // lion.major = "다른학과";
        // java: major is not public in class2.package1.Lion; cannot be accessed from outside package

        // Step 3-3: private 필드 접근 시도 → 컴파일 에러
        // System.out.println(lion.generation);
        // java: generation has private access in class2.package1.Lion
    }
}

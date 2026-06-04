package package1;

import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[Step 2] 객체 내부에서 입력값 검증");
        System.out.print("이름: ");
        String name = scanner.nextLine();
        System.out.print("전공: ");
        String major = scanner.nextLine();
        System.out.print("기수: ");
        int generation = Integer.parseInt(scanner.nextLine());

        System.out.println("Lion 객체를 먼저 생성합니다.");
        Lion lion = new Lion(name, major, generation);
        System.out.println("Lion 객체 생성 완료");

        System.out.println("객체 내부 상태 검증을 시작합니다.");
        String error = lion.getValidationError();
        if (error != null) {
            System.out.println("객체 내부 검증 실패: " + error);
            return;
        }

        System.out.println("객체 내부 검증 성공");
        lion.printInfo();
    }
}

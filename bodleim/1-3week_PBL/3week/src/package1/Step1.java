package package1;

import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("[Step 1] main에서 입력값 검증");
        System.out.print("이름: ");
        String name = scanner.nextLine();
        System.out.print("전공: ");
        String major = scanner.nextLine();
        System.out.print("기수: ");
        int generation = Integer.parseInt(scanner.nextLine());

        System.out.println("입력값 검증을 시작합니다.");

        String error = validate(name, major, generation);
        if (error != null) {
            System.out.println("입력값 검증 실패: " + error);
            System.out.println("Lion 객체는 생성되지 않았습니다.");
            return;
        }

        System.out.println("입력값 검증 성공");
        System.out.println("Lion 객체를 생성합니다.");

        Lion lion = new Lion(name, major, generation);

        System.out.println("Lion 객체 생성 완료");
        lion.printInfo();
    }

    private static String validate(String name, String major, int generation) {
        if (name == null || name.isBlank()) {
            return "이름은 비어 있을 수 없습니다.";
        }
        if (major == null || major.isBlank()) {
            return "전공은 비어 있을 수 없습니다.";
        }
        if (generation < 1) {
            return "기수는 1 이상이어야 합니다.";
        }
        return null;
    }
}

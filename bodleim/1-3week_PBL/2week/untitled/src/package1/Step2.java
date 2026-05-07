package package1;

import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("전공을 입력하세요: ");
        String major = scanner.nextLine();

        System.out.print("기수를 입력하세요: ");
        int generation = scanner.nextInt();

        // Step2: 검증 책임을 Lion 클래스에 위임
        if (!Lion.isValid(name, major, generation)) {
            System.out.println("오류: 입력값이 올바르지 않습니다.");
            System.out.println("조건: 이름/전공은 비어 있으면 안 되고, 기수는 1 이상이어야 합니다.");
            return;
        }

        Lion lion = new Lion(name, major, generation);

        System.out.println("\n[Step2] 객체 생성 완료");
        lion.printInfo();

        scanner.close();
    }
}
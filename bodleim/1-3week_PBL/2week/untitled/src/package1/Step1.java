package package1;

import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요: ");
        String name = scanner.nextLine();

        System.out.print("전공을 입력하세요: ");
        String major = scanner.nextLine();

        System.out.print("기수를 입력하세요: ");
        int generation = scanner.nextInt();

        // Step1: main에서 직접 검증
        if (name.trim().isEmpty()) {
            System.out.println("오류: 이름이 비어 있습니다.");
            return;
        }

        if (major.trim().isEmpty()) {
            System.out.println("오류: 전공이 비어 있습니다.");
            return;
        }

        if (generation < 1) {
            System.out.println("오류: 기수는 1 이상이어야 합니다.");
            return;
        }

        Lion lion = new Lion(name, major, generation);

        System.out.println("\n[Step1] 객체 생성 완료");
        lion.printInfo();

        scanner.close();
    }
}
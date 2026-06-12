import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int count = 0;

        while (true) {
            System.out.print("아기사자 수를 입력하세요 (5 이상): ");

            if (scanner.hasNextInt()) {
                count = scanner.nextInt();
                scanner.nextLine();

                if (count >= 5) {
                    break;
                } else {
                    System.out.println("5 이상의 숫자를 입력해야 합니다.");
                }
            } else {
                System.out.println("숫자를 입력해주세요.");
                scanner.nextLine();
            }
        }

        String[] names = new String[count];

        for (int i = 0; i < count; i++) {
            System.out.print((i + 1) + "번째 아기사자 이름을 입력하세요: ");
            names[i] = scanner.nextLine();
        }

        System.out.println("\n 아기사자 명단");
        System.out.println("------------------");
        System.out.println("총 인원: " + count);

        for (int i = 0; i < names.length; i++) {
            System.out.println((i + 1) + ". " + names[i]);
        }
        scanner.close();
        System.out.println("\n프로그램이 종료되었습니다.");
    }
}
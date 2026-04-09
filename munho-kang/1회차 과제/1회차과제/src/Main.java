
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//System.out.printf("Hello and welcome!");

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        while (true) {
            int n = 0;

            while (true) {
                System.out.println("🦁 저장할 아기사자 수를 5 이상 입력해주세요.");
                String input = scanner.nextLine();

                try {

                    n = Integer.parseInt(input);

                    if (n < 5) {
                        System.out.println("❗ [오류] 5 이상의 숫자를 입력해주세요.");
                        continue;
                    }
                    break;

                } catch (NumberFormatException e) {

                    System.out.println("❗ [오류] 숫자만 입력할 수 있습니다.");
                }
            }


            System.out.println("✏️ 아기사자 이름을 입력해주세요.");
            String[] names = new String[n];
            int count = 0;


            while (count < n) {
                String name = scanner.nextLine().trim();

                if (name.isEmpty()) {
                    System.out.println("⚠️ 이름이 비어있습니다. 다시 입력해주세요.");
                    continue;
                }

                boolean isDuplicate = false;
                for (int i = 0; i < count; i++) {
                    if (names[i].equals(name)) {
                        isDuplicate = true;
                        break;
                    }
                }

                if (isDuplicate) {
                    System.out.println("⚠️ 이미 등록된 이름입니다. 다시 입력해주세요.");
                    continue;
                }


                names[count] = name;
                count++;
            }


            System.out.println("\n📋 아기사자 명단을 최종적으로 출력합니다.");
            for (int i = 0; i < n; i++) {
                System.out.println("🦁 " + (i + 1) + ". " + names[i]);
            }

            System.out.println("====================");
            System.out.println("⛔ 프로그램을 종료하려면 'exit'를 입력하세요.");
            System.out.println("🔄 계속 아기사자를 등록하려면 'restart'를 입력하세요.");

            boolean isExit = false;
            while (true) {
                String command = scanner.nextLine();

                if (command.equals("exit")) {
                    System.out.println("👋 아기사자 명단 관리 프로그램을 종료합니다.");
                    isExit = true;
                    break;
                } else if (command.equals("restart")) {
                    System.out.println();
                    break;
                } else {
                    System.out.println("❗ 'exit' 또는 'restart'를 정확히 입력해주세요.");
                }
            }

            // 'exit'가 입력되었다면 메인 루프를 탈출하여 프로그램 최종 종료
            if (isExit) {
                break;
            }
        }

        scanner.close();

    }

}

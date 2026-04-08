package pack01;
import java.util.Scanner;

public class Step2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("🦁 아기사자 이름을 입력해주세요.");
        String name = sc.nextLine();
        System.out.println("🎓 전공을 입력해주세요.");
        String major = sc.nextLine();
        System.out.println("📌 기수를 입력해주세요.");
        int generation = sc.nextInt();

        // Step 2 : 일단 객체 생성 메시지부터
        Lion lion = new Lion(name, major, generation);

        if (lion.isValid()) {
            lion.printLionInfo();
        }
        sc.close();
    }
}

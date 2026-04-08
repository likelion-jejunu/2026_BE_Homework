package week01;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("저장할 아기사자 수를 5이상 입력해주세요.");
        int num = sc.nextInt();
        while(num<5){
            System.out.println("[오류] 5이상을 입력해주세요");
            System.out.println("저장할 아기사자 수를 5이상 입력해주세요.");
            num = sc.nextInt();
        }

        String[] names = new String[num];
        System.out.println("아기사자 이름을 입력해주세요.");
        for(int i=0;i<names.length;i++){
            names[i] = sc.next();
        }

        System.out.println("아기사자 명단을 최종적으로 출력합니다.");
        for(int i=0;i<names.length;i++){
            System.out.printf("%d. %s%n",(i+1),names[i]);
        }
    }
}
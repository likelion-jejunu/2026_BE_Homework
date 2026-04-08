package week02;
import java.util.Scanner;

public class step2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("아기사자 이름을 입력해주세요.");
        String name = sc.nextLine(); // 빈칸 입력
        System.out.println("전공을 입력해주세요.");
        String major = sc.nextLine();
        System.out.println("기수를 입력해주세요.");
        int generation = sc.nextInt();

        Lion lion = new Lion(name,major,generation);
        System.out.println("객체 생성이 완료되었습니다 아기사자 객체의 상태를 확인합니다.");
        if(lion.isValid()==1){
            System.out.println("아기사자 객체가 자신의 상태를 정상으로 판단했습니다.");
            System.out.println("아기사자 정보를 출력합니다.");
            System.out.printf("이름 : %s | 전공 : %s | 기수 : %d",name,major,generation);

        }

    }
}

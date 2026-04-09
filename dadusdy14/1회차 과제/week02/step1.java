package week02;
import java.util.Scanner;


public class step1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("아기사자 이름을 입력해주세요.");
        String name = sc.nextLine(); // 빈칸 입력
        System.out.println("전공을 입력해주세요.");
        String major = sc.nextLine();
        System.out.println("기수를 입력해주세요.");
        int generation = sc.nextInt();

        int valid = 1;
        System.out.println("입력값 검증을 진행합니다.");
        if(name.isEmpty()){
            System.out.println("이름은 비어있을 수 없습니다.");
            valid = 0;
        }if(major.isEmpty()){
            System.out.println("전공은 비어있을 수 없습니다.");
            valid = 0;
        }if(generation<1){
            System.out.println("기수는 1미만일 수 없습니다.");
            valid = 0;
        }if(valid==1){
            System.out.println("입력값 검증을 통과하여 아기사자 객체 생성을 진행합니다.");
            Lion lion = new Lion(name, major, generation);
            System.out.println("아기사자 객체를 성공적으로 생성하였습니다.");
            System.out.println("아기사자 정보를 출력합니다.");
            System.out.printf("이름 : %s | 전공 : %s | 기수 : %d",name,major,generation);

        }
    }
}

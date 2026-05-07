package class2.example;
import java.util.Scanner;

public class Step1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("아기사자 이름을 입력해주세요.");
        String name=input.nextLine();

        System.out.println("전공을 입력해주세요.");
        String major=input.nextLine();

        System.out.println("기수를 입력해주세요.");
        int generation=input.nextInt();
        /*
        System.out.println("입력값 검증을 시작합니다.");
        if(name.trim().isEmpty()){
            System.out.println("이름은 비어있을 수 없습니다.");
        } else if(major.trim().length()==0){
            System.out.println("전공은 비어있을 수 없습니다.");
        } else if(generation<1){
            System.out.println("기수는 비어있을 수 없습니다.");
        }else{
            System.out.println("입력값 검증을 통과하여 아기사자 객체를 생성합니다.");
            Lion lion = new Lion(name,major,generation);
            System.out.println("아기사자 객체를 성공적으로 생성하였습니다.");
            System.out.println("아기사자 정보를 출력합니다.");
            lion.printInfo();
        }
         */
        Lion lion = new Lion(name,major,generation);
        System.out.println("객체 생성이 완료되었습니다. 아기사자의 객체를 확인합니다.");
        if(lion.isValid()){
            System.out.println("아기사자 객체가 자신의 상태를 정상으로 판단했습니다.");
            System.out.println("아기사자 정보를 출력합니다.");
            lion.printInfo();
        }else{
            System.out.println("잘못된 아기사자 정보입니다.");
        }
    }
}

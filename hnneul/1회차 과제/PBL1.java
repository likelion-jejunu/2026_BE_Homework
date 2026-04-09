import java.util.Scanner;

//TIP 코드를 <b>실행</b>하려면 <shortcut actionId="Run"/>을(를) 누르거나
// 에디터 여백에 있는 <icon src="AllIcons.Actions.Execute"/> 아이콘을 클릭하세요.
public class PBL1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count;

        do{
            System.out.print("저장할 아기사자 수를 5 이상 입력해주세요: ");
            count = sc.nextInt();
            if(count < 5)
                System.out.println("[오류] 5 이상 입력해주세요.");
        }while(count < 5);

        String[] name = new String[count];
        System.out.println("아기사자 이름을 입력해주세요.");
        sc.nextLine();

        for(int i=0; i<count; i++){
            name[i] = sc.nextLine();
        }

        System.out.println("아기사자 명단을 최종적으로 출력합니다.");

        for(int i=0;i<count;i++){
            System.out.println(name[i]);
        }


    }
}
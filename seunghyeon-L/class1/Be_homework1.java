package class1;

import java.util.Scanner;

public class Be_homework1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;
        while(true) {
            System.out.println("저장할 아기사자 수를 5 이상 입력해주세요.");
            num = input.nextInt();
            if (num >= 5) {
                break;
            }
            System.out.println("[오류] 5이상 입력해주세요.");
        }

        String[] lionArr=new String[num];
        System.out.println("아기사자 이름을 입력해주세요.");
        for(int x=0;x<lionArr.length;x++){
            lionArr[x]=input.next();
        }
        input.close();
        for(int x=0;x<lionArr.length;x++){
            System.out.printf("%d. %s\n",x+1,lionArr[x]);
        }
    }
}

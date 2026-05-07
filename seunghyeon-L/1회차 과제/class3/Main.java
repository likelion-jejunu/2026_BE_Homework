package class3;
import class3.role.Lion;
import class3.role.Staff;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("=====아기사자 정보 입력=====");

        System.out.print("이름 : ");
        String name = input.next();

        System.out.print("전공 : ");
        String major = input.next();

        System.out.print("기수 : ");
        int generation = input.nextInt();

        System.out.print("파트 : ");
        String part = input.next();

        System.out.print("학번 : ");
        int studentId=input.nextInt();
        Lion lion=new Lion(name, major, generation, part, studentId);

        System.out.println("=====운영진 정보 입력=====");

        System.out.print("이름 : ");
        String nameS = input.next();

        System.out.print("전공 : ");
        String majorS = input.next();

        System.out.print("기수 : ");
        int generationS = input.nextInt();

        System.out.print("파트 : ");
        String partS = input.next();

        System.out.print("직책 : ");
        String position=input.next();
        Staff staff=new Staff(nameS, majorS, generationS, partS, position);
        lion.printInfo();
        staff.printInfo();
    }
}

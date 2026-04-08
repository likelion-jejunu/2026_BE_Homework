//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import policy.ConditionPolicy;
import policy.GenerationConditionPolicy;
import role.Alumni;
import role.Lion;
import role.Member;
import role.Staff;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Member> members = new ArrayList<>();


        System.out.println("======  아기사자 정보 입력 ======");
        System.out.print(" 이름: ");
        String lionName = scanner.nextLine();
        System.out.print(" 전공: ");
        String lionMajor = scanner.nextLine();
        System.out.print(" 기수: ");
        int lionGen = Integer.parseInt(scanner.nextLine());
        System.out.print(" 파트 (백엔드/프론트엔드/기획/디자인): ");
        String lionPart = scanner.nextLine();
        System.out.print(" 학번: ");
        String lionStudentId = scanner.nextLine();
        members.add(new Lion(lionName, lionMajor, lionGen, lionPart, lionStudentId));

        System.out.println();


        System.out.println("====== 👨💼 운영진 정보 입력 ======");
        System.out.print(" 이름: ");
        String staffName = scanner.nextLine();
        System.out.print(" 전공: ");
        String staffMajor = scanner.nextLine();
        System.out.print(" 기수: ");
        int staffGen = Integer.parseInt(scanner.nextLine());
        System.out.print(" 파트 (백엔드/프론트엔드/기획/디자인): ");
        String staffPart = scanner.nextLine();
        System.out.print(" 직책 (대표/부대표/파트장/멘토): ");
        String staffPosition = scanner.nextLine();
        members.add(new Staff(staffName, staffMajor, staffGen, staffPart, staffPosition));

        System.out.println();


        System.out.println("======  알럼나이 정보 입력 ======");
        System.out.print(" 이름: ");
        String alumName = scanner.nextLine();
        System.out.print(" 전공: ");
        String alumMajor = scanner.nextLine();
        System.out.print(" 기수: ");
        int alumGen = Integer.parseInt(scanner.nextLine());
        System.out.print(" 파트 (백엔드/프론트엔드/기획/디자인): ");
        String alumPart = scanner.nextLine();
        System.out.print(" 현재 직무: ");
        String alumJob = scanner.nextLine();
        members.add(new Alumni(alumName, alumMajor, alumGen, alumPart, alumJob));

        System.out.println();


        System.out.println("====== 📋 결과 출력 ======");
        for (Member member : members) {
            System.out.println(" 역할: " + member.getRoleName());
            System.out.println(member.getCommonInfo());
            System.out.println(member.getRoleDetailedInfo());

            String submitStatus = member.canSubmit() ? " 가능" : " 불가능";
            System.out.println(" 과제 제출 가능 여부: " + submitStatus);
            System.out.println("----------------------------------------");
        }

        System.out.println();


        System.out.println("======  조건 정책 결과 ======");
        int minGen = 14;
        ConditionPolicy genPolicy = new GenerationConditionPolicy(minGen);

        System.out.println(" 최소 기수 조건: " + minGen + "기 이상\n");

        for (Member member : members) {
            System.out.println(" " + member.getName() + " (" + member.getGeneration() + "기)");

            boolean isConditionMet = genPolicy.checkCondition(member.getGeneration());
            String conditionStatus = isConditionMet ? " 충족" : " 미충족";

            System.out.println(" 기수 조건 충족 여부: " + conditionStatus);
            System.out.println("----------------------------------------");
        }

        scanner.close();
    }
}
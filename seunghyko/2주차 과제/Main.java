package oop.Register;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private Scanner sc;
    private List<User> users; // 제네릭을 사용하여 User 객체만 담도록 명시

    public Main() {
        this.sc = new Scanner(System.in);
        this.users = new ArrayList<>();
    }

    // 프로그램 실행의 큰 흐름을 담당하는 메서드
    public void start() {
        System.out.println("=================");
        System.out.println("회원등록");
        System.out.println("=================");

        if (!askToProceed("회원가입을 하시겠습니까?")) {
            System.out.println("=================");
            System.out.println("회원가입이 종료됩니다.");
            System.out.println("=================");
            return; // 프로그램 종료
        }

        System.out.println("=================");
        System.out.println("회원가입이 진행됩니다.");
        System.out.println("=================");

        while (true) {
            registerSingleUser(); // 단일 유저 가입 로직 호출

            if (!askToProceed("회원가입을 이어서 하시겠습니까?")) {
                break;
            }
        }

        System.out.println("프로그램을 종료합니다.");
    }

    // Y/N 질문을 처리하는 공통 메서드
    private boolean askToProceed(String message) {
        while (true) {
            System.out.println(message + "\ny : 진행   N : 취소");
            System.out.print(">> ");
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("y")) {
                return true;
            } else if (input.equalsIgnoreCase("n")) {
                return false;
            } else {
                System.out.println("입력 값을 확인해주세요.");
            }
        }
    }

    // 1명의 회원을 가입시키는 로직
    private void registerSingleUser() {
        System.out.print("ID: ");
        String username = sc.nextLine();

        String password = getValidPassword(); // 비밀번호 검증 로직 분리

        System.out.print("성명: ");
        String name = sc.nextLine();

        String birthDate = getValidBirthDate(); // 생년월일 검증 로직 분리

        System.out.print("이메일: ");
        String email = sc.nextLine();

        // 입력받은 정보로 User 객체 생성 및 리스트 추가
        User newUser = new User(username, password, name, birthDate, email);
        users.add(newUser);

        // 객체에게 스스로 환영 인사를 출력하도록 지시
        newUser.printWelcomeMessage();
    }

    // 패스워드 입력 및 일치 검증 메서드
    private String getValidPassword() {
        while (true) {
            System.out.print("PW: ");
            String password = sc.nextLine();
            System.out.print("PW 확인: ");
            String passwordConfirm = sc.nextLine();

            if (password.equals(passwordConfirm)) {
                return password;
            }
            System.out.println("=================");
            System.out.println("패스워드가 일치하지 않습니다.");
            System.out.println("패스워드를 다시 입력해주세요.");
            System.out.println("=================");
        }
    }

    // 생년월일 입력 및 길이 검증 메서드
    private String getValidBirthDate() {
        while (true) {
            System.out.print("생년월일(6자리): ");
            String birthDate = sc.nextLine();

            if (birthDate.length() == 6) {
                return birthDate;
            }
            System.out.println("=================");
            System.out.println("생년월일 자릿수가 올바르지 않습니다.");
            System.out.println("생년월일을 다시 입력해주세요");
            System.out.println("=================");
        }
    }

    // main 메서드는 프로그램의 진입점 역할만 수행하도록 최소화
    public static void main(String[] args) {
        Main program = new Main();
        program.start();
    }
}
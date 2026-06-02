package practice.UserRester;

import java.util.Scanner;

// 회원 한 명의 정보를 저장하는 클래스
public class User {
    String username;
    String password;
    String name;
    String birth_date;
    String email;


    // 가입 완료 메시지
    void showMessage(){
        System.out.println(name + " 님, 가입을 환영합니다.");
        System.out.println("ID는 " + username + " 입니다");
    }
}

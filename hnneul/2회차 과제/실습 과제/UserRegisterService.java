package practice.UserRester;

import java.util.ArrayList;
import java.util.Scanner;

public class UserRegisterService {
    Scanner sc = new Scanner(System.in);
    // 가입한 회원 저장 리스트
    ArrayList<User> users = new ArrayList<>();

    // 회원 가입을 진행할지
    void start(){
        boolean register = false;
        while(!register){
            System.out.println("회원가입을 하시겠습니까?");
            System.out.println("y:진행    n:종료 ");
            System.out.print(">> ");

            String rester_input = sc.nextLine();

            if(rester_input.equalsIgnoreCase("y")){
                register = true;
                System.out.println("회원가입이 진행됩니다.");
                register();
            } else if (rester_input.equalsIgnoreCase("n")) {
                System.out.println("회원가입이 종료됩니다.");
                System.exit(0);
            } else {
                System.out.println("입력값을 확인해주세요.");
            }
        }

        // 가입이 끝나고 이어서 진행할지
        while(true){
            System.out.println("회원가입을 이어서 진행하시겠습니까?");
            System.out.println("y:진행    n:종료 ");
            System.out.print(">> ");

            String rester_again = sc.nextLine();

            if(rester_again.equalsIgnoreCase("y")){
                register();
            } else if (rester_again.equalsIgnoreCase("n")) {
                System.out.println("회원가입이 종료됩니다.");
                System.exit(0);
            } else {
                System.out.println("입력값을 확인해주세요.");
            }
        }
    }

    //ID
    String inputUsername(){
        System.out.print("ID: ");
        return sc.nextLine();
    }

    //password
    String inputPassword(){
        String password;
        while (true){
            System.out.print("PW: ");
            password = sc.nextLine();
            System.out.print("PW 확인: ");
            String password_confirm = sc.nextLine();

            //password가 동일한지 확인
            if (password.equals(password_confirm)){
                break;
            }else{
                System.out.println("PW가 일치하지 않습니다.");
                System.out.println("PW를 다시 입력해주세요.");
            }
        }
        return password;
    }

    //이름
    String inputName(){
        System.out.print("이름: ");
        return sc.nextLine();
    }

    //생년월일
    String inputBirth(){
        String birth_date;

        while (true){
            System.out.print("생년월일(6자리): ");
            birth_date = sc.nextLine();

            //6자리가 맞는지 확인
            if (birth_date.length() == 6){
                break;
            } else {
                System.out.println("생년월일 자릿수가 올바르지 않습니다.");
                System.out.println("다시 입력해주세요.");
            }
        }

        return birth_date;
    }

    //email
    String inputEmail(){
        System.out.print("email: ");
        return sc.nextLine();
    }

    //회원 한 명을 생성 -> 값을 저장
    void register() {
        User user = new User();

        user.username = inputUsername();
        user.password = inputPassword();
        user.name = inputName();
        user.birth_date = inputBirth();
        user.email = inputEmail();

        users.add(user);
        System.out.println("-------------");
        user.showMessage();
    }
}

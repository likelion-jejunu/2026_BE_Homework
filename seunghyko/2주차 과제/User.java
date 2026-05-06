package oop.Register;

public class User {
    // 1. 필드는 private으로 은닉화 (캡슐화)
    private String username;
    private String password;
    private String name;
    private String birthDate;
    private String email;

    // 2. 생성자를 통한 초기화
    public User(String username, String password, String name, String birthDate, String email) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.birthDate = birthDate;
        this.email = email;
    }

    // 3. Getter 메서드 (필요한 정보만 외부에서 읽을 수 있도록)
    public String getUsername() {
        return username;
    }

    public String getName() {
        return name;
    }

    // 4. 객체 스스로 자신의 환영 메시지를 출력하는 행위(메서드) 부여
    public void printWelcomeMessage() {
        System.out.println("-----------------");
        System.out.println(this.name + "님, 가입을 환영합니다.");
        System.out.println("ID는 " + this.username + " 입니다.");
        System.out.println("-----------------");
    }
}
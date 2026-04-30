package oop.prac2;

class User {
    public String name;
    public int age; // 누구나 접근 가능
}

public class CapsuleEx {
    public static void main(String[] args) {
        User user = new User();
        user.name = "아기사자";

        //실수: 나이에 마이너스 값을 입력
        user.age = -500;

        System.out.println(user.name + "의 나이: " + user.age);
        //결과: 아기사자의 나이: -500 -> 나이는 음수가 될 수 없는데?

        User2 user2 = new User2();
        user2.setName("아기사자");
        user2.setAge(-500); // 오류: 나이는 음수가 될 수 없습니다!
        System.out.println(user2.getName() + "의 나이: " + user2.getAge()); // 결과: 아기사자의 나이: 0

    }
}


class User2 {
    private String name;
    private int age;

    // Setter: 데이터를 넣을 때 검사를 수행
    public void setAge(int age) {
        if (age < 0) {
            System.out.println("오류: 나이는 음수가 될 수 없습니다! (입력값: " + age + ")");
            return;
        }
        this.age = age;
    }

    public int getAge() {
        return age;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
}


package prac01.inheritance_good;

class Person {
    private String name;
    private int age;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public int getAge() { return age; }
    public void setAge(int age) { this.age = age; }
}

class Student extends Person {
    private String major;

    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }
}

class Teacher extends Person {
    private String subject;  // 선생님 전용

    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }
}


public class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.setName("아기사자");
        s.setMajor("컴퓨터공학과");

        Teacher t = new Teacher();
        t.setName("사자선생님");
        t.setSubject("자바프로그래밍");

        System.out.println(s.getName() + " | " + s.getMajor());
        System.out.println(t.getName() + " | " + t.getSubject());


    }
}

package prac01.inheritance_bad;

public class Teacher {
    private String name;   // Student랑 중복
    private int age;       // Student랑 중복

    public String getName() { return name; }   // 중복
    public void setName(String name) { this.name = name; }  // 중복

    //선생님 전용 기능
    private String subject;
    public String getSubject() { return subject; }
    public void setSubject(String subject) { this.subject = subject; }
}
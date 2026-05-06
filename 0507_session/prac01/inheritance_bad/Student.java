package prac01.inheritance_bad;

public class Student {
    private String name;
    private int age;

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    //학생 전용 기능
    private String major;
    public String getMajor() { return major; }
    public void setMajor(String major) { this.major = major; }
}

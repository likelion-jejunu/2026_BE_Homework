package week03;

public class Lion extends Member {
    String studentId;

    public Lion(String name, String major, int generation, String part, String studentId){
        super(name, major, generation, part);
        this.studentId = studentId;
    }

    @Override
    public String getInfo() {
        return String.format("이름: %s | 전공: %s | 기수: %d | 파트: %s%n 학번: %s",
                name, major, generation, part, studentId);
    }

    @Override
    public Submit getPolicy() {
        return new LionPolicy();
    }
}

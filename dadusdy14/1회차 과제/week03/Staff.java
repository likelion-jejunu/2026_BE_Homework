package week03;

public class Staff extends Member{
    String position;

    public Staff(String name, String major, int generation, String part, String position){
        super(name, major, generation, part);
        this.position = position;
    }
    @Override
    public String getInfo() {
        return String.format("이름: %s | 전공: %s | 기수: %d | 파트: %s%n 직책: %s",
                name, major, generation, part, position);
    }
    @Override
    public Submit getPolicy() {
        return new StaffPolicy();
    }
}

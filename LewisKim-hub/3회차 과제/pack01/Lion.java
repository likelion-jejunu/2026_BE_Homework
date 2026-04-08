package pack01;

public class Lion extends LikeLionMember {
    private String studentId;

    public Lion(String name, String major, int generation, String part, String studentId) {
        super(name, major, generation, part);
        this.studentId = studentId;
    }

    @Override
    public String getRoleName() { return "아기사자"; }

    @Override
    public String getDetailInfo() { return "🆔 학번: " + studentId; }

    @Override
    public AssignmentPolicy getAssignmentPolicy() { return new LionAssignmentPolicy(); }
}

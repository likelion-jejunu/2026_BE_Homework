package pack01;

public class Staff extends LikeLionMember {
    private String role;

    public Staff(String name, String major, int generation, String part, String role) {
        super(name, major, generation, part);
        this.role = role;
    }

    @Override
    public String getRoleName() { return "운영진"; }

    @Override
    public String getDetailInfo() { return "⭐ 직책: " + role; }

    @Override
    public AssignmentPolicy getAssignmentPolicy() { return new StaffAssignmentPolicy(); }
}

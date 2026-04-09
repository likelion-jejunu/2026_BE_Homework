package role;

import policy.LionTaskPolicy;
import policy.TaskPolicy;

public class Lion extends Member {
    private String studentId;

    public Lion(String name, String major, int generation, String part, String studentId) {
        super(name, major, generation, part);
        this.studentId = studentId;
    }

    @Override
    protected TaskPolicy getTaskPolicy() {
        return new LionTaskPolicy();
    }

    @Override
    public String getRoleName() {
        return "아기사자";
    }

    @Override
    public String getRoleDetailedInfo() {
        return " 학번: " + studentId;
    }
}

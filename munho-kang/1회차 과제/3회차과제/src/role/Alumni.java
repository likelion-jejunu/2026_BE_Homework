package role;

import policy.AlumniTaskPolicy;
import policy.TaskPolicy;

public class Alumni extends Member {
    private String currentJob;

    public Alumni(String name, String major, int generation, String part, String currentJob) {
        super(name, major, generation, part);
        this.currentJob = currentJob;
    }

    @Override
    protected TaskPolicy getTaskPolicy() {
        return new AlumniTaskPolicy();
    }

    @Override
    public String getRoleName() {
        return "알럼나이";
    }

    @Override
    public String getRoleDetailedInfo() {
        return " 현재 직무: " + currentJob;
    }
}
package role;

import policy.TaskPolicy;

public abstract class Member {

    private String name;
    private String major;
    private int generation;
    private String part;

    public Member(String name, String major, int generation, String part) {
        this.name = name;
        this.major = major;
        this.generation = generation;
        this.part = part;
    }

    public String getName() { return name; }
    public String getMajor() { return major; }
    public int getGeneration() { return generation; }
    public String getPart() { return part; }


    protected abstract TaskPolicy getTaskPolicy();


    public abstract String getRoleName();


    public abstract String getRoleDetailedInfo();


    public boolean canSubmit() {
        return getTaskPolicy().canSubmitTask();
    }


    public String getCommonInfo() {
        return String.format(" 이름: %s |  전공: %s |  기수: %d |  파트: %s",
                name, major, generation, part);
    }
}
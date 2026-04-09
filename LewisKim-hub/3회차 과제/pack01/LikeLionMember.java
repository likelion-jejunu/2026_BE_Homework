package pack01;

public abstract class LikeLionMember {
    protected String name;
    protected String major;
    protected int generation;
    protected String part;

    public LikeLionMember(String name, String major, int generation, String part) {
        this.name = name;
        this.major = major;
        this.generation = generation;
        this.part = part;
    }

    public abstract String getRoleName();     // 아기사자/운영진
    public abstract String getDetailInfo();   // 학번/직책
    public abstract AssignmentPolicy getAssignmentPolicy(); // 어떤 정책 부품

    public void printInfo() {
        System.out.println("\n🎭 역할: " + getRoleName());
        System.out.println("👤 이름: " + name + " | 🎓 전공: " + major + " | 📌 기수: " + generation + " | 💻 파트: " + part);
        System.out.println(getDetailInfo());
        
        AssignmentPolicy policy = getAssignmentPolicy();
        String result = policy.canSubmit() ? "✅ 가능" : "❌ 불가능";
        System.out.println("📝 과제 제출 가능 여부: " + result);
    }
}

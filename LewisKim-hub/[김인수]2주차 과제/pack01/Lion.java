package pack01;

public class Lion {
    public String name;
    String major;
    private int generation;

    public Lion(String name, String major, int generation) {
        this.name = name;
        this.major = major;
        this.generation = generation;
    }

    // Step 2용 검증 메서드
    public boolean isValid() {
        System.out.println("⏩ 객체 생성이 완료되었습니다. 아기사자 객체의 상태를 확인합니다.");

        if (name == null || name.isEmpty()) {
            System.out.println("❌ 이름이 비어 있습니다.");
            System.out.println("❌ 잘못된 아기사자 정보입니다.");
            return false;
        }

        if (major == null || major.isEmpty() || generation < 1) {
            System.out.println("❌ 잘못된 아기사자 정보입니다.");
            return false;
        }

        System.out.println("✅ 아기사자 객체가 자신의 상태를 정상으로 판단했습니다.");
        return true;
    }

    // 공통 정보 출력 메서드
    public void printLionInfo() {
        System.out.println("🦁 아기사자 정보를 출력합니다.");
        System.out.println("👤 이름: " + name + " | 🎓 전공: " + major + " | 📌 기수: " + generation);
    }
}

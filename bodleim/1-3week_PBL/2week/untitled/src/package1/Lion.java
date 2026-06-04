package package1;

public class Lion {
    public String name;      // public
    String major;            // default(package-private)
    private int generation;  // private

    public Lion(String name, String major, int generation) {
        this.name = name;
        this.major = major;
        this.generation = generation;
    }

    // Step2에서 사용할 검증 메서드
    public static boolean isValid(String name, String major, int generation) {
        if (name == null || name.trim().isEmpty()) {
            return false;
        }
        if (major == null || major.trim().isEmpty()) {
            return false;
        }
        if (generation < 1) {
            return false;
        }
        return true;
    }

    public void printInfo() {
        System.out.println("이름: " + name);
        System.out.println("전공: " + major);
        System.out.println("기수: " + generation);
    }

    // private 필드 접근용 getter / setter
    public int getGeneration() {
        return generation;
    }

    public void setGeneration(int generation) {
        this.generation = generation;
    }
}
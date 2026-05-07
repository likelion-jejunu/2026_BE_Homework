package package1;

public class Lion {
    public String name;
    String major;
    private int generation;

    public Lion(String name, String major, int generation) {
        this.name = name;
        this.major = major;
        this.generation = generation;
    }

    public boolean isValid() {
        return getValidationError() == null;
    }

    public String getValidationError() {
        if (name == null || name.isBlank()) {
            return "이름은 비어 있을 수 없습니다.";
        }
        if (major == null || major.isBlank()) {
            return "전공은 비어 있을 수 없습니다.";
        }
        if (generation < 1) {
            return "기수는 1 이상이어야 합니다.";
        }
        return null;
    }

    public void printInfo() {
        System.out.println("이름: " + name);
        System.out.println("전공: " + major);
        System.out.println("기수: " + generation);
    }

    public int getGeneration() {
        return generation;
    }
}

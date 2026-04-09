package week02;

public class Lion {
    private String name;
    String major;
    public int generation;

    public Lion(String name, String major, int generation){
        this.name = name;
        this.major = major;
        this.generation = generation;
    }
    public int isValid(){
        int valid = 1;
        System.out.println("입력값 검증을 진행합니다.");
        if(this.name.isEmpty()){
            System.out.println("이름은 비어있을 수 없습니다.");
            valid = 0;
        }if(this.major.isEmpty()){
            System.out.println("전공은 비어있을 수 없습니다.");
            valid = 0;
        }if(this.generation<1){
            System.out.println("기수는 1미만일 수 없습니다.");
            valid = 0;
        }
        return valid;
    }
}

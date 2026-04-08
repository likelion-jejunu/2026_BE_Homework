package class2.example;


public class Lion {
    public String name;
    String major;
    private int generation;

    public Lion(String name, String major, int generation){
        this.name=name;
        this.major=major;
        this.generation=generation;
    }
    public void printInfo(){
        System.out.printf("이름: %s | 전공: %s | 기수: %d\n",name, major,generation);
    }
    public boolean isValid(){
        if(this.name.trim().isEmpty()){
            System.out.println("이름은 비어있을 수 없습니다.");
        } else if(major.trim().length()==0){
            System.out.println("전공은 비어있을 수 없습니다.");
        } else if(generation<1){
            System.out.println("기수는 비어있을 수 없습니다.");
        }else{
            return true;
        }
        return false;
    }
}

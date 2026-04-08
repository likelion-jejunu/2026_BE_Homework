package class3.role;

import class3.policy.SubmitPolicy;

abstract class Member {
    private String name;
    private String major;
    private int generation;
    private String part;

    public Member(String name, String major, int generation, String part){
        this.name=name;
        this.major=major;
        this.generation=generation;
        this.part=part;
    }
    public String getName(){
        return name;
    }
    public String getMajor(){
        return major;
    }
    public int getGeneration(){
        return generation;
    }
    public String getPart(){
        return part;
    }
    abstract SubmitPolicy submit();
    abstract String detailPart();

    public boolean canSubmit(){
        return submit().canSubmit();
    }

    public void printInfo(){
        System.out.println(detailPart());
        System.out.println("과제 제출 가능 여부: "+(canSubmit()?"가능":"불가능"));
    }
}

package class3.role;

import class3.policy.LionSubmitPolicy;
import class3.policy.SubmitPolicy;

public class Lion extends Member{
    private int studentId;
    public Lion(String name, String major, int generation, String part, int studentId){
        super(name, major, generation, part);
        this.studentId = studentId;
    }
    public SubmitPolicy submit(){
        return new LionSubmitPolicy();
    }
    public String detailPart(){
        return "이름: " + getName() +
                "\n전공: " + getMajor() +
                "\n기수: " + getGeneration() +
                "\n파트: " + getPart()+
                "\n학번: " + studentId;
    }
}

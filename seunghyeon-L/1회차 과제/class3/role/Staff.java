package class3.role;

import class3.policy.StaffSubmitPolicy;
import class3.policy.SubmitPolicy;

public class Staff extends Member{
    private String position;
    public Staff(String name, String major, int generation, String part, String position){
        super(name, major, generation, part);
        this.position = position;
    }
    public SubmitPolicy submit(){
        return new StaffSubmitPolicy();
    }
    public String detailPart(){
        return "이름: " + getName() +
                "\n전공: " + getMajor() +
                "\n기수: " + getGeneration() +
                "\n파트: " + getPart()+
                "\n직책: " + position;
    }

}

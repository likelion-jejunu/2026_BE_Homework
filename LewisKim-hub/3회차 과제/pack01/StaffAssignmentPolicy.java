package pack01;

public class StaffAssignmentPolicy implements AssignmentPolicy {
    @Override
    public boolean canSubmit() {
        return false; 
    }
}

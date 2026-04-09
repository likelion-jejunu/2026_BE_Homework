package PBL3.policy;

public class StaffPolicy implements SubmitPolicy {
    @Override
    public boolean canSubmit() {
        return false;
    }
}

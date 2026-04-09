package policy;

public class StaffTaskPolicy implements TaskPolicy {
    @Override
    public boolean canSubmitTask() {
        return false;
    }
}
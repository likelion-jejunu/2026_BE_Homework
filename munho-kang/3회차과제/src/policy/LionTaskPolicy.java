package policy;

public class LionTaskPolicy implements TaskPolicy {
    @Override
    public boolean canSubmitTask() {
        return true;
    }
}

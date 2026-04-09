package week03;

public class StaffPolicy implements Submit{
    @Override
    public boolean canSubmit() {
        return false;
    }
}

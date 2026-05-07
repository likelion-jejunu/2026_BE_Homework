package policy;

public class AlumniTaskPolicy implements TaskPolicy {
    @Override
    public boolean canSubmitTask() {
        // 요구사항에는 '가능'으로 나오지만 결과물 사진에는 '불가능'으로 나옴
        return false;
    }
}
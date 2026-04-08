package policy;

public class GenerationConditionPolicy implements ConditionPolicy {
    private final int minGeneration;

    public GenerationConditionPolicy(int minGeneration) {
        this.minGeneration = minGeneration;
    }

    @Override
    public boolean checkCondition(int generation) {
        return generation >= minGeneration;
    }
}

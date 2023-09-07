package BehavioralDesignPatterns.StrategyPattern;

public class OperationManager {

    private Strategy strategy;

    public OperationManager(Strategy strategy) {
        this.strategy = strategy;
    }

    public int execute(int num1, int num2) {
        return strategy.execute(num1, num2);
    }
}

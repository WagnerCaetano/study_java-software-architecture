package BehavioralDesignPatterns.StrategyPattern;

public class BehavioralPatternStrategy {

    public static void main(String[] args) {

        OperationManager context = new OperationManager(new Addition());
        System.out.println("10 + 5 = " + context.execute(10, 5));

        context = new OperationManager(new Subtraction());
        System.out.println("10 - 5 = " + context.execute(10, 5));

        context = new OperationManager(new Multiplication());
        System.out.println("10 * 5 = " + context.execute(10, 5));
    }
}
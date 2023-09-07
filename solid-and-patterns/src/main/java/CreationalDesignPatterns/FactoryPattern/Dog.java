package DesignPatterns.FactoryPattern;

public class Dog implements Animal{
    @Override
    public void eat() {
        System.out.println("Dog eats.");
    }
}

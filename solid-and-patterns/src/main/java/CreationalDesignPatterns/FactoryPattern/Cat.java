package CreationalDesignPatterns.FactoryPattern;

public class Cat implements Animal{
    @Override
    public void eat() {
        System.out.println("Cat eats.");
    }
}

package SOLID.LiskovSubstitution;

public abstract class Vehicle {

    protected String type;
    protected int age;

    public Vehicle (String type, int age) {
        this.type = type;
        this.age = age;
    }

    protected void speedUp() {
        System.out.println("Speeding up");
    }

    protected void slowDown() {
        System.out.println("Slowing down");
    }

    protected abstract void fuel();
}

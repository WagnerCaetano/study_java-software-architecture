package SOLID.LiskovSubstitution;

public class EletricCar extends Vehicle{

    public EletricCar(String type, int age) {
        super(type, age);
    }

    @Override
    protected void speedUp() {
        System.out.println("Eletric Car speeding up");
    }

    @Override
    protected void slowDown() {
        System.out.println("Eletric Car slowing down");
    }

    @Override
    protected void fuel() {
        System.out.println("Eletric Car is charging");
    }
}

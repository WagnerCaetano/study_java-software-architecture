package SOLID.LiskovSubstitution;

public class PetrolCar extends Vehicle{

    public PetrolCar(String type, int age) {
        super(type, age);
    }

    @Override
    protected void speedUp() {
        System.out.println("Petrol Car speeding up");
    }

    @Override
    protected void slowDown() {
        System.out.println("Petrol Car slowing down");
    }

    @Override
    protected void fuel() {
        System.out.println("We can use petrol without any problem");
    }
}

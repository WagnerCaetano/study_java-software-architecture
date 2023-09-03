package SOLID.LiskovSubstitution;

public class SolidLiskovSubstitution {

    public static void main(String[] args) {
        Vehicle car = new EletricCar("Car", 2);

        car.speedUp();
        car.slowDown();
        car.fuel();
    }
}
package DesignPatterns.FactoryPattern;

public class AnimalFactory {

    public static Animal getAnimal(AnimalType animalType) {
        switch (animalType) {
            case DOG:
                return new Dog();
            case CAT:
                return new Cat();
            case TIGER:
                return new Tiger();
            case LION:
                return new Lion();
            default:
                return null;
        }
    }
}

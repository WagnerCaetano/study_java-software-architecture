package DesignPatterns.FactoryPattern;


public class DesignPatternFactory {

    public static void main(String[] args) {

        Animal animal = AnimalFactory.getAnimal(AnimalType.DOG);
        animal.eat();

    }
}
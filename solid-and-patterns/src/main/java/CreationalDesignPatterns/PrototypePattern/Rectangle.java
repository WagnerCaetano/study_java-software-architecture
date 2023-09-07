package DesignPatterns.PrototypePattern;

public class Rectangle extends Shape{

    public Rectangle(int width, int height) {
        super(width, height);
    }

    @Override
    public void draw() {
        System.out.println("Rectangle with width: " + width + " and height: " + height);
    }

    @Override
    public Shape clone() {
        return new Rectangle(this.width, this.height);
    }
}

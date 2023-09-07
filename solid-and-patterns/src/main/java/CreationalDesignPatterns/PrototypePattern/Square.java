package CreationalDesignPatterns.PrototypePattern;

public class Square extends Shape{

    public Square(int width, int height) {
        super(width, height);
    }

    @Override
    public void draw() {
        System.out.println("Square with width: " + width + " and height: " + height);
    }

    @Override
    public Shape clone() {
        return new Square(this.width, this.height);
    }
}

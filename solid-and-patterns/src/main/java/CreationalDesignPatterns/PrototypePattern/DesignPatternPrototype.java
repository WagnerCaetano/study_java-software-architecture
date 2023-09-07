package CreationalDesignPatterns.PrototypePattern;



public class DesignPatternPrototype {

    public static void main(String[] args) {

        Square square = new Square(10, 20);
        square.draw();

        Shape clonedSquare = square.clone();
        clonedSquare.draw();
    }
}
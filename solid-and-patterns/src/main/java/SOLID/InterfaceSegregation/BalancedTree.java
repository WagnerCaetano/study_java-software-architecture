package SOLID.InterfaceSegregation;

public class BalancedTree implements RotationTree {

    @Override
    public void insert() {
        System.out.println("Inserting");
    }

    @Override
    public void delete() {
        System.out.println("Deleting");
    }

    @Override
    public void traverse() {
        System.out.println("Traversing");
    }

    @Override
    public void leftRotation() {
        System.out.println("Left rotation");
    }

    @Override
    public void rightRotation() {
        System.out.println("Right rotation");
    }
}

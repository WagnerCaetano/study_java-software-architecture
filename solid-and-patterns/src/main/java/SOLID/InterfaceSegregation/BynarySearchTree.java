package SOLID.InterfaceSegregation;

public class BynarySearchTree implements Tree{

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
}

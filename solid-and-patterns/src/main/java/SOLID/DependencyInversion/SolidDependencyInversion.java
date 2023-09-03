package SOLID.DependencyInversion;

public class SolidDependencyInversion {

    public static void main(String[] args) {

        new DatabaseController(new MySQLDatabase()).connect();
    }
}
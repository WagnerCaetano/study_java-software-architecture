package SOLID.DependencyInversion;

public class MySQLDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("Connecting");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting");
    }
}

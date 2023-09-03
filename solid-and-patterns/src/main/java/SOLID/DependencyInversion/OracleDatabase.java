package SOLID.DependencyInversion;

public class OracleDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("Connecting");
    }

    @Override
    public void disconnect() {
        System.out.println("Disconnecting");
    }
}

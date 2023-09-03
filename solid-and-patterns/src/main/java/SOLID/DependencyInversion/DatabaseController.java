package SOLID.DependencyInversion;

public class DatabaseController {

    private Database database;

    public DatabaseController(Database dependency) {
        this.database = dependency;
    }

    public void connect() {
        database.connect();
    }

    public void disconnect() {
        database.disconnect();
    }
}

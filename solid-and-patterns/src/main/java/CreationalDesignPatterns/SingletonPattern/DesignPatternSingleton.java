package CreationalDesignPatterns.SingletonPattern;
public class DesignPatternSingleton {

    public static void main(String[] args) {

        DatabaseConnector databaseConnector1 = DatabaseConnector.getInstance();
        DatabaseConnector databaseConnector2 = DatabaseConnector.getInstance();

        System.out.println(databaseConnector1 == databaseConnector2);



        Database database1 = Database.INSTANCE;
        Database database2 = Database.INSTANCE;

        System.out.println(database1 == database2);
    }
}
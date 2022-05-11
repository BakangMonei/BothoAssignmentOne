package PayrollSystem;


// Loader class
public class Main {
    public static DatabaseManager dbManager; // Shared Database manager

    public static void main(String[] args) {
        dbManager = new DatabaseManager("");
        // If "the path to the database file" is empty, a temporary in-memory database is opened

        (new LoginFrame()).setVisible(true);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an instance of DatabaseManager to establish the connection
        DatabaseManager dbManager = new DatabaseManager();

        // Insert a sample student
        dbManager.insertStudent("Alice Smith", "alice.smith@example.com");

        // Close the connection when done
        dbManager.close();
    }
}

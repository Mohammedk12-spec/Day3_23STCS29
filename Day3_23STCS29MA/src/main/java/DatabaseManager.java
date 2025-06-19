import com.mongodb.client.MongoClient;
import com.mongodb.client.MongoClients;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;

public class DatabaseManager {
    private MongoClient mongoClient;
    private MongoDatabase database;

    public DatabaseManager() {
        try {
            mongoClient = MongoClients.create("mongodb://localhost:27017");
            database = mongoClient.getDatabase("student_enrollment");
            System.out.println("Successfully connected to MongoDB at localhost:27017");
        } catch (Exception e) {
            System.err.println("Error connecting to MongoDB: " + e.getMessage());
            e.printStackTrace(); // Print the stack trace for debugging
            // Optionally, you might want to re-throw the exception or handle it differently
            // throw e; // Re-throwing the exception would stop the application
        }
    }

    public void insertStudent(String name, String email) {
        if (database == null) {
            System.err.println("Database connection not established. Cannot insert student.");
            return;
        }
        try {
            MongoCollection<Document> collection = database.getCollection("students");
            Document doc = new Document("name", name).append("email", email);
            collection.insertOne(doc);
            System.out.println("Inserted student: " + name); // Confirmation message
        } catch (Exception e) {
            System.err.println("Error inserting student: " + e.getMessage());
            e.printStackTrace(); // Print the stack trace for debugging
        }
    }

    public void close() {
        if (mongoClient != null) {
            try {
                mongoClient.close();
                System.out.println("MongoDB connection closed.");
            } catch (Exception e) {
                System.err.println("Error closing MongoDB connection: " + e.getMessage());
                e.printStackTrace();
            }
        }
    }
}

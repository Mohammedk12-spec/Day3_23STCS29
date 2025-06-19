import org.bson.types.ObjectId;

public class Student {
    private ObjectId id;
    private String name;
    private String email;

    // Constructor, Getters, and Setters
    public Student(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }
}

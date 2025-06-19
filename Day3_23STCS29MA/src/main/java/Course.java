import org.bson.types.ObjectId;

public class Course {
    private ObjectId id;
    private String name;
    private String description;

    // Constructor, Getters, and Setters
    public Course(String name, String description) {
        this.name = name;
        this.description = description;
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

    public String getDescription() {
        return description;
    }
}

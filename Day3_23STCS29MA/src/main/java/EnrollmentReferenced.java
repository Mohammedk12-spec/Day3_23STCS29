import org.bson.types.ObjectId;

public class EnrollmentReferenced {
    private ObjectId studentId;
    private ObjectId courseId;

    // Constructor, Getters, and Setters
    public EnrollmentReferenced(ObjectId studentId, ObjectId courseId) {
        this.studentId = studentId;
        this.courseId = courseId;
    }

    public ObjectId getStudentId() {
        return studentId;
    }

    public ObjectId getCourseId() {
        return courseId;
    }
}

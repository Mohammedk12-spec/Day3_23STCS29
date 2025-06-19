public class EnrollmentEmbedded {
    private Student student;
    private Course course;

    // Constructor, Getters, and Setters
    public EnrollmentEmbedded(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public Student getStudent() {
        return student;
    }

    public Course getCourse() {
        return course;
    }
}


package UsesA;

public class Course {
    private String courseName;
    private String courseCode;
    private Instructor instructor;

    public Instructor getInstructor() {
        return instructor;
    }

    public void setInstructor(Instructor instructor) {
        this.instructor = instructor;
    }

    public Course(String courseName, String courseCode, Instructor instructor) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.instructor = instructor;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }
    public double calculateAvg(Student[] students){
        double avg = 0;
        for (Student student : students) {
            avg += student.getNote();
        }
        return avg / students.length;
    }
}

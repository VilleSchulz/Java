package t03;

import java.io.Serializable;

public class Enrollment implements Serializable {
    Student student;
    Course course;
    String enrollment;
    public Enrollment(Student student, Course course, String enrollment) {
        this.student = student;
        this.course = course;
        this.enrollment = enrollment;
        course.addStudent(student);
    }
    public String getenrollment() {
        return enrollment;
    }

}

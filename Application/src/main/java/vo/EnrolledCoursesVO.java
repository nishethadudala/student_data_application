package vo;

import com.StudentData.Application.entity.Courses;

import java.sql.Date;

public class EnrolledCoursesVO {

    private int studentCourseEnrollmentId;
    private int studentId;
    private Courses courseId;
    private Date enrolledDate;

    public int getStudentCourseEnrollmentId() {
        return studentCourseEnrollmentId;
    }

    public void setStudentCourseEnrollmentId(int studentCourseEnrollmentId) {
        this.studentCourseEnrollmentId = studentCourseEnrollmentId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public Courses getCourseId() {
        return courseId;
    }

    public void setCourseId(Courses courseId) {
        this.courseId = courseId;
    }

    public Date getEnrolledDate() {
        return enrolledDate;
    }

    public void setEnrolledDate(Date enrolledDate) {
        this.enrolledDate = enrolledDate;
    }
}

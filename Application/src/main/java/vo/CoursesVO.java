package vo;

public class CoursesVO {

    private int courseId;
    private String courseName;
    private Boolean practicals;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public Boolean getPracticals() {
        return practicals;
    }

    public void setPracticals(Boolean practicals) {
        this.practicals = practicals;
    }
}

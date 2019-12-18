package vo;

import com.StudentData.Application.entity.Student;

public class ActivitiesVO {


    private  Student studentId;
    private String fullName;
    private String artClass;
    private String sportClass;
    private String danceClass;
    private String musicClass;

    public Student getStudentId() {
        return studentId;
    }

    public void setStudentId(Student studentId) {
        this.studentId = studentId;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getArtClass() {
        return artClass;
    }

    public void setArtClass(String artClass) {
        this.artClass = artClass;
    }

    public String getSportClass() {
        return sportClass;
    }

    public void setSportClass(String sportClass) {
        this.sportClass = sportClass;
    }

    public String getDanceClass() {
        return danceClass;
    }

    public void setDanceClass(String danceClass) {
        this.danceClass = danceClass;
    }

    public String getMusicClass() {
        return musicClass;
    }

    public void setMusicClass(String musicClass) {
        this.musicClass = musicClass;
    }
}

package vo;

public class ResultsVO {

    private String full_name;
    private int  Physics;
    private int   Chemistry;
    private int  Computers;
    private int  student_total;
    private int  term_total;
    private int  average;
    private String  grade;
    private String results;
    private int studentId;

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public int getPhysics() {
        return Physics;
    }

    public void setPhysics(int physics) {
        Physics = physics;
    }


    public int getChemistry() {
        return Chemistry;
    }

    public void setChemistry(int chemistry) {
        Chemistry = chemistry;
    }

    public int getComputers() {
        return Computers;
    }

    public void setComputers(int computers) {
        Computers = computers;
    }

    public int getStudent_total() {
        return student_total;
    }

    public void setStudent_total(int student_total) {
        this.student_total = student_total;
    }

    public int getTerm_total() {
        return term_total;
    }

    public void setTerm_total(int term_total) {
        this.term_total = term_total;
    }

    public int getAverage() {
        return average;
    }

    public void setAverage(int average) {
        this.average = average;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public String getResults() {
        return results;
    }

    public void setResults(String results) {
        this.results = results;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
}

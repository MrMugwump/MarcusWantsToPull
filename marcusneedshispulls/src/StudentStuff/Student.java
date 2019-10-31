package StudentStuff;

public class Student {
    private String studentName;
    private float grade;
    private int abilityLevel;

    public Student(String studentName, float grade, int abilityLevel) {
        this.studentName = studentName;
        this.grade = grade;
        this.abilityLevel = abilityLevel;
    }

    public Student(String studentName, int abilityLevel){
        this.studentName = studentName;
        this.abilityLevel = abilityLevel;
    }

    public Student(String studentName, float grade){
        this.grade = grade;
        abilityLevel = (int)grade/100;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public float getGrade() {
        return grade;
    }

    public void setGrade(float grade) {
        this.grade = grade;
    }

    public int getAbilityLevel() {
        return abilityLevel;
    }

    public void setAbilityLevel(int abilityLevel) {
        this.abilityLevel = abilityLevel;
    }
}

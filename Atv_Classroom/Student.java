public class Student {
    private int enrollment;
    private String name;

    public Student() {}

    public Student(int enrollment, String name) {
        this.enrollment = enrollment;
        this.name = name;
    }

    public void setName(String newName) {
        this.name = newName;
    }

    public void setEnrollment(int newEnrollment) {
        this.enrollment = newEnrollment;
    }

    public String getName() {
        return this.name;
    }

    public int getEnrollment() {
        return this.enrollment;
    }
}

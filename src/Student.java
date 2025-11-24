public class Student extends Person {
    private String major;
    private int creditsCompleted;

    public Student(String name, String email, String major, int creditsCompleted) {
        super(name, email);
        this.major = major;
        this.creditsCompleted = creditsCompleted;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getCreditsCompleted() {
        return creditsCompleted;
    }

    public void setCreditsCompleted(int creditsCompleted) {
        this.creditsCompleted = creditsCompleted;
    }

    @Override
    public String toString() {
        return String.format(
                "| Student Details |%n" +
                        "-----------------%n" +
                        "ID: %s%n" +
                        "Name: %s%n" +
                        "Email: %s%n" +
                        "Major: %s%n" +
                        "Credits Completed: %d",
                this.id, this.name, this.email, this.major, this.creditsCompleted
        );
    }

    @Override
    public void assignCourse(String courseName) {

    }
}
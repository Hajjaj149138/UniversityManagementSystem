public class Course {
    private String courseCode;
    private String courseTitle;
    private int maxStudents;

    public Course(String courseCode, String courseTitle, int maxStudents) {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.maxStudents = maxStudents;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public int getMaxStudents() {
        return maxStudents;
    }
}
public class Faculty extends Person {
    private String department;
    private double salary;

    public Faculty(String name, String email, String department, double salary) {
        super(name, email);
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void assignCourse(String courseName) {
        System.out.println("Confirmation: " + this.name + " (Faculty) has been assigned to " + courseName);
    }
}
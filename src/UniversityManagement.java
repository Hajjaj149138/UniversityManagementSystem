import java.util.ArrayList;
import java.util.List;

public class UniversityManagement {
    public static void main(String[] args) {
        List<Person> universityMembers = new ArrayList<>();

        Student student1 = new Student("Abul Kalam", "abul.kalam@university.edu", "Computer Science", 60);

        Student student2 = new Student("Abdul Jabbar", "abdul.jabbar@university.edu", "History", 30);

        Faculty faculty1 = new Faculty("Sohel Khan", "sohel.khan@university.edu", "Math", 75000.00);

        universityMembers.add(student1);
        universityMembers.add(student2);
        universityMembers.add(faculty1);

        System.out.println("--- Module 6 Assignment: UMS Core Test ---");

        for (Person person : universityMembers) {
            System.out.println("\n--------------------------------------");

            System.out.println("# ID: " + person.getID() + " | Name: " + person.getName());

            if (person instanceof Student) {
                Student student = (Student) person;
                System.out.println(student.toString());
            } else if (person instanceof Faculty) {
                person.assignCourse("Object-Oriented Design");
            }
        }

        System.out.println("\n--------------------------------------");
        System.out.println("Test Complete, Thank You...");
    }
}
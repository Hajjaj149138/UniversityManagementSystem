Project Title: University Management System Core



Problem Overview : 

The goal of this assignment is to design and implement the core data structure for a simplified University Management System (UMS) using fundamental Object-Oriented Programming (OOP) principles in Java.

Students must demonstrate a solid understanding of:

Classes and Objects: Modeling real-world entities.

Inheritance: Establishing hierarchical relationships (e.g., separating general "Person" attributes from specific "Student" or "Faculty" roles).

Encapsulation: Using private fields and public getter/setter methods to protect data integrity.

Abstract Classes/Interfaces: Defining contracts and common behavior.

Polymorphism: Implementing methods that behave differently based on the object type.



Part 1: Core Class Design
1. The Identifiable Interface
All entities in the UMS must have a unique ID.

- Create a public interface named Identifiable.

- It should contain a single method signature: String getID().

2. The Person Abstract Class
This class serves as the base class for everyone in the system (students and faculty).

- Create an abstract class named Person that implements the Identifiable interface.

- Fields (all protected):

String id

String name

String email

- Constructor: Implement a constructor that accepts a name and email. The ID should be automatically generated within the constructor.

- Methods:

Implement public String getID() as required by the interface.

Provide public getter and setter methods for name and email.

3. The Student Class
- Create a concrete class named Student that extends Person.

- Fields (all private):

String major

int creditsCompleted

- Constructor: Implement a constructor that calls the parent constructor and initializes the two new fields.

- Methods:

Provide public getter and setter methods for major and creditsCompleted.

Override the toString() method from Object to return a formatted string containing all of the student's information (ID, Name, Email, Major, Credits).

4. The Faculty Class
- Create a concrete class named Faculty that extends Person.

- Fields (all private):

String department

double salary

- Constructor: Implement a constructor that calls the parent constructor and initializes the two new fields.

- Methods:

Provide public getter and setter methods for department and salary.

Implement an abstract method (defined in the Person class - see extension task) or a concrete method called assignCourse(String courseName) that simply prints a confirmation message.



Part 2: Implementation & Testing
1. Course Class
- Create a simple class named Course.

- Fields (all private):

String courseCode

String courseTitle

int maxStudents

- Constructor: Implement a constructor to initialize all fields.

- Methods: Provide public getter methods for all fields.

2. UniversityManagement Class (Main Application)
- Create a class with a main() method to test your OOP design.

- Inside main(), create a list (e.g., ArrayList<Person>) to hold all students and faculty.

- Instantiate and add the following objects to the list:

One Student: Abul Kalam, majoring in Computer Science, with 60 credits.

One Student: Abdul Jabbar, majoring in History, with 30 credits.

One Faculty: Sohel Khan, in the Math department, with a salary of 75000.

- Iterate through the list of Person objects and perform the following actions:

Print the ID and Name of every person.

If the person is an instance of Student, call the toString() method and print the full details.

If the person is an instance of Faculty, call the assignCourse("Object-Oriented Design") method.

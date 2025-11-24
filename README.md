<b>Project Title: University Management System Core</b>

A simplified University Management System (UMS) in Java demonstrating OOP principles such as inheritance, encapsulation, polymorphism, abstract classes, and interfaces.

Features

Identifiable Interface: Ensures unique IDs for all entities.

Person (Abstract Class): Base for students and faculty (id, name, email).

Student Class: Stores major and creditsCompleted, overrides toString().

Faculty Class: Stores department and salary, can assign courses.

Course Class: Represents a course with code, title, and max students.

Testing

Stores students and faculty in a list (ArrayList<Person>).

Sample Data:

Student: Abul Kalam, CS, 60 credits

Student: Abdul Jabbar, History, 30 credits

Faculty: Sohel Khan, Math, salary 75000

Prints ID & Name; Students → full details; Faculty → assigned course.

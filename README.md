# java-student-gpa-records
This project is a console-based Java application for managing basic student GPA records. It demonstrates class design, constructors, encapsulation, setters/getters, and formatted output.

## Features

- `Student` class that stores:
  - `name`
  - `ID`
  - `GPA`
- Multiple constructors:
  - A default constructor
  - A parameterized constructor with name, ID, and GPA
- Getter and setter methods, including `setGPA()` to update GPA.
- `toString()` returns a tab-separated line suitable for display in a table.
- `StudentClient`:
  - Prompts the user for a student's name, ID, and GPA using `Scanner`.
  - Creates one student from user input and one using the default constructor.
  - Prints student records before and after updating the GPA of the default student.

## Concepts Demonstrated

- Class design and encapsulation
- Overloaded constructors
- Setters and getters
- Basic console input with `Scanner`
- Simple tabular output formatting

## How to Run

From the `src` directory:

```bash
javac Student.java StudentClient.java
java StudentClient

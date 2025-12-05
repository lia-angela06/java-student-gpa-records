public class StudentGPA {
    // Private fields
    private String name;
    private int ID;
    private double GPA;

    // Default constructor
    public Student() {
        name = "John Doe";
        ID = 999999;
        GPA = 4.0;
    }

    // Constructor with parameters
    public Student(String name, int ID, double GPA) {
        this.name = name;
        this.ID = ID;
        setGPA(GPA); // use setter to validate GPA
    }

    // Accessors (getters)
    public String getName() {
        return name;
    }

    public int getID() {
        return ID;
    }

    public double getGPA() {
        return GPA;
    }

    // Mutators (setters)
    public void setName(String name) {
        this.name = name;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public void setGPA(double GPA) {
        // GPA must be between 0.0 and 4.0
        if (GPA >= 0.0 && GPA <= 4.0) {
            this.GPA = GPA;
        } else {
            System.out.println("Invalid GPA value. Setting GPA to 0.0 by default.");
            this.GPA = 0.0;
        }
    }

    // toString() method
    public String toString() {
        return name + "\t" + ID + "\t" + GPA;
    }
}

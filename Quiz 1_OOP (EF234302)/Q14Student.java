// File: Q14Student.java
public class Q14Student {
    // Properties/fields
    private String name;
    private String studentID;
    private String degreeProgramme;
    // Constructor
    public Q14Student(String name, String studentID, String degreeProgramme) {
        this.name = name;
        this.studentID = studentID;
        this.degreeProgramme = degreeProgramme;
    }
    // Getter for name
    public String getName() {
        return name;
    }
    // Getter for studentID
    public String getStudentID() {
        return studentID;
    }
    // Getter for degreeProgramme
    public String getDegreeProgramme() {
        return degreeProgramme;
    }
    // toString method
    @Override
    public String toString() {
        return "[" + name + ", ID: " + studentID + ", " + degreeProgramme + "]";
    }
}
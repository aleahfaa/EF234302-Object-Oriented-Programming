// File: Q13ComputerAccount.java
public class Q13ComputerAccount {
    // Properties/fields
    private String realName;
    private String userName;
    private String password;
    // Constructor
    public Q13ComputerAccount(String realName, String userName, String password) {
        this.realName = realName;
        this.userName = userName;
        this.password = password;
    }
    // Getter for realName
    public String getRealName() {
        return realName;
    }
    // Getter for userName
    public String getUserName() {
        return userName;
    }
    // Getter for password (Note: It's generally not recommended to expose passwords like this, but for this assignment, we'll do it for demonstration purposes)
    public String getPassword() {
        return password;
    }
    // Setter for password
    public void changePassword(String newPassword) {
        this.password = newPassword;
    }
    // Method to print realName
    public void printRealName() {
        System.out.println("Real Name: " + realName);
    }
    // Method to print userName
    public void printUserName() {
        System.out.println("User Name: " + userName);
    }
    // Method to print password (Again, this is not recommended in a real-world scenario)
    public void printPassword() {
        System.out.println("Password: " + password);
    }
}
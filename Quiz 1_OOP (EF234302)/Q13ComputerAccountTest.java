// File: Q13ComputerAccountTest.java
public class Q13ComputerAccountTest {
    public static void main(String[] args) {
        // Creating a Q13ComputerAccount instance
        Q13ComputerAccount account = new Q13ComputerAccount("Marta Sapta", "MartaSapta2", "password123");
        // Printing realName, userName, and password
        account.printRealName();
        account.printUserName();
        account.printPassword();
        // Changing the password
        account.changePassword("newpassword123");
        // Printing the updated password
        account.printPassword();
    }
}
package entities;
import java.util.Scanner;
public class owner {
    public static void main(String[] args) {
        String adminUsername = "hamada";
        String adminPassword = "hamada";

        Scanner scanner = new Scanner(System.in);

        System.out.println("Admin Login Page");

        System.out.print("Enter your username: ");
        String enteredUsername = scanner.nextLine();

        System.out.print("Enter your password: ");
        String enteredPassword = scanner.nextLine();

        if (enteredUsername.equals(adminUsername) && enteredPassword.equals(adminPassword)) {
            System.out.println("Login successful! Welcome, HAMADA eshta.");
            // Additional code for admin functionality can be added here
        } else {
            System.out.println("Invalid username or password. Access denied.");
        }

        scanner.close();
    }
}
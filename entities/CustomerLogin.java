package entities;
import java.util.Scanner;
import lombok.Data;

@Data
public class CustomerLogin {

    public static void main(String[] args) {
        String username = "hamada";
        String password = "hamada";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your username: ");
        String enteredUsername = scanner.nextLine();

        System.out.print("Enter your password: ");
        String enteredPassword = scanner.nextLine();

        if (enteredUsername.equals(username) && enteredPassword.equals(password)) {
            System.out.println("Login successful! Welcome, " + username + ".");
        } else {
            System.out.println("Invalid username or password. Please try again.");
        }

        scanner.close();
    }
}
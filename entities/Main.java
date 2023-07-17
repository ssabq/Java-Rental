package entities;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lombok.Data;

@Data

public class Main {

    public static void main(String[] args) {
        List<String> availableItems = new ArrayList<>();
        availableItems.add("1 hamada's STUDIO");
        availableItems.add("2 hamada's APARTMENT");
        availableItems.add("3 hamada's VILLA");



        List<String> rentedItems = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Welcome to HAMADA's  Rental site!");

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. View Available Properties at HAMADA's");
            System.out.println("2. Rent a Property");
            System.out.println("3. View Rented Property");
            System.out.println("4. Returning Property");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
            input = scanner.nextLine();

            if (input.equals("1")) {
                System.out.println("\nAvailable Properties:");
                for (String item : availableItems) {
                    System.out.println(item);
                }
            } else if (input.equals("2")) {
                System.out.print("Enter the Property name you want to rent: ");
                String itemToRent = scanner.nextLine();
                if (availableItems.contains(itemToRent)) {
                    availableItems.remove(itemToRent);
                    rentedItems.add(itemToRent);
                    System.out.println(itemToRent + " has been rented successfully.");
                } else {
                    System.out.println(itemToRent + " is not available for rent.");
                }
            } else if (input.equals("3")) {
                System.out.println("\nRented Items:");
                for (String item : rentedItems) {
                    System.out.println(item);
                }
            } else if (input.equals("4")) {
                System.out.print("Enter the Property name you want to cancel: ");
                String itemToReturn = scanner.nextLine();
                if (rentedItems.contains(itemToReturn)) {
                    rentedItems.remove(itemToReturn);
                    availableItems.add(itemToReturn);
                    System.out.println(itemToReturn + " has been cancelled successfully.");
                } else {
                    System.out.println(itemToReturn + " is not rented by you.");
                }
            } else if (input.equals("5")) {
                System.out.println("Thank you for using the HAMADA Rental. Goodbye!");
                break;
            } else {
                System.out.println("Invalid choice. Please try again.");
            }
        }

        scanner.close();
    }
}
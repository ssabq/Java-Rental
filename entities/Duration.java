package entities;
import lombok.Data;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;
@Data
public class Duration {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Rental Property Duration Calculator");

        System.out.print("Enter the start date (yyyy-mm-dd): ");
        String startDateString = scanner.nextLine();
        LocalDate startDate = LocalDate.parse(startDateString);

        System.out.print("Enter the end date (yyyy-mm-dd): ");
        String endDateString = scanner.nextLine();
        LocalDate endDate = LocalDate.parse(endDateString);

        // Calculate the duration in days
        long durationInDays = ChronoUnit.DAYS.between(startDate, endDate);

        System.out.println("The rental duration is " + durationInDays + " days.");

        scanner.close();
    }
}
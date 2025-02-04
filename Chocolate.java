import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Chocolate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input number of boxes
        System.out.print("Enter the no. of boxes: ");
        int numberOfBoxes = scanner.nextInt();

        // Step 2: Validate number of boxes
        if (numberOfBoxes <= 0 || numberOfBoxes > 10) {
            System.out.println("Invalid input");
            return;
        }

        // Step 3: List to store number of chocolates
        List<Integer> chocolates = new ArrayList<>();

        // Step 4: Input number of chocolates for each box
        for (int i = 1; i <= numberOfBoxes; i++) {
            System.out.print("Enter the no. of chocolates in box " + i + ": ");
            int chocolatesInBox = scanner.nextInt();

            // Step 5: Check if first box is invalid (odd or negative chocolates)
            if (i == 1 && (chocolatesInBox <= 0 || chocolatesInBox % 2 != 0)) {
                System.out.println("Sorry!!! First box always should contain positive even no. of chocolates");
                return;
            }

            // Add the chocolates in the list
            chocolates.add(chocolatesInBox);
        }

        // Step 6: Process the boxes
        List<Integer> remainingBoxes = new ArrayList<>();
        for (int i = 0; i < chocolates.size(); i++) {
            if (chocolates.get(i) % 2 != 0) {
                // If odd chocolates, remove the first box
                if (!remainingBoxes.isEmpty()) {
                    remainingBoxes.remove(0); // Remove the first box
                }
            } else {
                // If even chocolates, keep the box
                remainingBoxes.add(chocolates.get(i));
            }
        }

        // Step 7: Print remaining chocolates in each box
        System.out.print("No. of chocolates in each box: ");
        if (remainingBoxes.isEmpty()) {
            System.out.println();  // No boxes remain
        } else {
            for (int i = 0; i < remainingBoxes.size(); i++) {
                System.out.print(remainingBoxes.get(i));
                if (i < remainingBoxes.size() - 1) {
                    System.out.print(" ");  // Print space between numbers
                }
            }
            System.out.println();
        }
    }
}

import java.util.Scanner;

public class ex_03 {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter X and Y separated by a space
        System.out.print("Enter X and Y separated by a space: ");
        
        // Read the input line and split it into two integers
        String inputLine = scanner.nextLine();
        String[] inputParts = inputLine.split(" ");

        // Check if there are exactly two input parts
        if (inputParts.length != 2) {
            System.out.println("Invalid input. Please enter two integers separated by a space.");
        } else {
            try {
                // Parse the input parts into integers
                int x = Integer.parseInt(inputParts[0]);
                int y = Integer.parseInt(inputParts[1]);

                // Calculate the product of X and Y
                int product = x * y;

                // Print the product
                System.out.println("Product of X and Y: " + product);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter valid integers.");
            }
        }

        // Close the scanner
        scanner.close();
    }
}

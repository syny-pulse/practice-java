import java.util.*;

public class ex_04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter X Y: ");
        String inputLine = scanner.nextLine();
        String[] inputParts = inputLine.split(" ");
        int X = Integer.parseInt(inputParts[0]);
        int Y = Integer.parseInt(inputParts[1]);
        int product = X * Y;
        System.out.println(product);

    }
}

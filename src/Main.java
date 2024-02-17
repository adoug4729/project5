import java.util.Scanner;

/**
 * Main class to demonstrate the SortedStack functionality.
 */
public class Main {
    public static void main(String[] args) {
        SortedStack sortedStack = new SortedStack();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter integers to push onto the stack ('end' to finish):");

        while (scanner.hasNext()) {
            String input = scanner.next();
            if ("end".equalsIgnoreCase(input)) {
                break;
            }
            try {
                int number = Integer.parseInt(input);
                sortedStack.push(number);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter an integer.");
            }
        }

        System.out.println("Elements in the stack (smallest to largest):");
        while (!sortedStack.isEmpty()) {
            System.out.println(sortedStack.pop());
        }

        scanner.close();
    }
}

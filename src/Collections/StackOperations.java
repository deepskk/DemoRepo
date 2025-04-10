package Collections;

import java.util.Scanner;
import java.util.Stack;

public class StackOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();

        while (true) {
            System.out.println("\n========= Stack Menu =========");
            System.out.println("1. Push Data");
            System.out.println("2. Pop Data");
            System.out.println("3. Display Stack");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Clear buffer

            switch (choice) {
                case 1:
                    System.out.print("Enter data to push: ");
                    stack.push(sc.nextLine());
                    break;

                case 2:
                    if (!stack.isEmpty()) {
                        System.out.println("Popped: " + stack.pop());
                    } else {
                        System.out.println("Stack is empty!");
                    }
                    break;

                case 3:
                    System.out.println("Stack Content (Top to Bottom): " + stack);
                    break;

                case 4:
                    System.out.println("Exiting Stack Program...");
                    return;

                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}

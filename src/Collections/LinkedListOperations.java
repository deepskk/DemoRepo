package Collections;

import java.util.LinkedList;
import java.util.Scanner;

public class LinkedListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LinkedList<String> list = new LinkedList<>();

        while (true) {
            System.out.println("\n========== LinkedList Menu ==========");
            System.out.println("1. Add Node at First");
            System.out.println("2. Add Node at Last");
            System.out.println("3. Remove Node from First");
            System.out.println("4. Remove Node from Last");
            System.out.println("5. View All Nodes");
            System.out.println("6. Exit");
            System.out.print("Enter your choice: ");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter value to add at first: ");
                    list.addFirst(sc.nextLine());
                    break;

                case 2:
                    System.out.print("Enter value to add at last: ");
                    list.addLast(sc.nextLine());
                    break;

                case 3:
                    if (!list.isEmpty()) {
                        System.out.println("Removed: " + list.removeFirst());
                    } else {
                        System.out.println("List is empty.");
                    }
                    break;

                case 4:
                    if (!list.isEmpty()) {
                        System.out.println("Removed: " + list.removeLast());
                    } else {
                        System.out.println("List is empty.");
                    }
                    break;

                case 5:
                    System.out.println("LinkedList Data: " + list);
                    break;

                case 6:
                    System.out.println("Exiting... Thank you!");
                    return;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}

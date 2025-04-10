package Collections;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListOperations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> list = new ArrayList<>();

        while(true)
        {
            System.out.println("\n--- Menu ---" );
            System.out.println("1. Add Data");
            System.out.println("2. View All Data");
            System.out.println("3. Search (Contains)");
            System.out.println("3. Search (indexOf)");
            System.out.println("4. Delete by Index");
            System.out.println("5. Count Elements");
            System.out.println("6. Check if Empty");
            System.out.println("8. Exit");

            int ch = sc.nextInt();
            sc.nextLine();

            switch (ch){
                case 1:
                    System.out.print("Enter value to add: ");
                    String val =sc.nextLine();
                    list.add(val);
                    break;

                case 2:
                    System.out.print("ArrayList Data: "+list);
                    break;
                case 3:
                    System.out.print("Enter Value to search (Contains): ");
                    String search = sc.nextLine();
                    System.out.println("Found: "+list.contains(search) );
                    break;
                case 4:
                    System.out.print("Enter value to search (indexOf): ");
                    String idxSearch = sc.nextLine();
                    System.out.println("Index: "+list.indexOf(idxSearch));
                    break;
                case 5:
                    System.out.print("Enter index to delete: ");
                    int index = sc.nextInt();
                    if(index >=0 && index<list.size())
                    {
                        list.remove(index);
                        System.out.println("Deleted.");
                    }else {
                        System.out.println("Invalid index.");
                    }
                    break;
                case 6:
                    System.out.println("Total elements: "+list.size() );
                    break;
                case 7:
                    System.out.println("Is ArrayList empty? "+list.isEmpty());
                    break;
                case 8:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid choice!");


            }
        }
    }
}

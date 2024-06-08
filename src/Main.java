import java.util.Scanner;
import java.util.Date;

public class Main {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int option;

        do {
            System.out.println("\n### Maritime Data Management System ###");
            System.out.println("1. Create User");
            System.out.println("2. Create Safety System");
            System.out.println("3. Create Local");
            System.out.println("4. Create Maritime Data");
            System.out.println("5. Create Data Source");
            System.out.println("6. Create Maritime Data Source");
            System.out.println("7. Display Information");
            System.out.println("9. Exit");
            System.out.print("Select an option: ");
            option = scanner.nextInt();

            switch (option) {
                case 1:
                    // User creation logic
                    break;
                case 2:
                    // SafetySystem creation logic
                    break;
                case 3:
                    // Local creation logic
                    break;
                case 4:
                    // MaritimeData creation logic
                    break;
                case 5:
                    // DataSource creation logic
                    break;
                case 6:
                    // MDSource creation logic
                    break;
                case 7:
                    // Display information logic
                    break;
                case 9:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid option! Please try again.");
            }
        } while (option != 9);

        scanner.close();
    }
}
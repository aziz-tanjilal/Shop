import java.util.Scanner;

public class Menu {
    public void menu() {
        Shop shop = new Shop();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("\n========== SHOP MENU ==========");
            System.out.println("1. View book details");
            System.out.println("2. Change book attributes");
            System.out.println("3. Change attributes of all books");
            System.out.println("4. Buy a book");
            System.out.println("5. Select pen color and type");
            System.out.println("6. Buy a pen");
            System.out.println("0. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    shop.viewBookDetails();
                    break;
                case 2:
                    shop.changeBookAttributes();
                    break;
                case 3:
                    shop.changeAllBookAttributes();
                    break;
                case 4:
                    shop.buyBook();
                    break;
                case 5:
                    shop.selectPenColorAndType();
                    break;
                case 6:
                    shop.buyPen();
                    break;
                case 0:
                    System.out.println("Exiting the program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 0);
    }
}
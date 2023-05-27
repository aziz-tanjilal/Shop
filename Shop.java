import java.util.Scanner;

public class Shop {
    private Book[] books;
    private String penColor;
    private String penType;

    public Shop() 
    {
        // Create an array of books
        books = new Book[2];
        books[0] = new Book("Information Technology", "Information System, Programming fundamentals, and Websystem", true, 67);
        books[1] = new Book("Business", "Business Management, Marketing Strategies, and Financial Planning", false, 92);

        penColor = "";
        penType = "";
    }

    public void viewBookDetails() {
    System.out.println("========== BOOK DETAILS ==========");
    for (int i = 0; i < books.length; i++) {
        System.out.println("Book Index: " + i);
        books[i].displayDetails();
        System.out.println("--------------------");
    }
}

    public void changeBookAttributes() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the index of the book you want to modify: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < books.length) {
            Book book = books[index];

            System.out.print("Enter the new name of the book: ");
            scanner.nextLine(); // Consume the newline character
            String name = scanner.nextLine();
            book.setName(name);

            System.out.print("Enter the new contents of the book: ");
            String contents = scanner.nextLine();
            book.setContents(contents);

            System.out.print("Enter true if the book is hardcover, false otherwise: ");
            boolean isHardcover = scanner.nextBoolean();
            book.setHardcover(isHardcover);

            System.out.print("Enter the new total pages in the book: ");
            int pageCount = scanner.nextInt();
            book.setPageCount(pageCount);

            System.out.println("Modified book details:");
            book.displayDetails();
        } else {
            System.out.println("Invalid book index.");
        }
    }

    public void changeAllBookAttributes() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the new contents for all books: ");
        String contents = scanner.nextLine();

        for (Book book : books) {
            book.setContents(contents);
        }

        System.out.println("Modified contents for all books.");
    }

    public void buyBook() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the index of the book you want to buy: ");
        int index = scanner.nextInt();

        if (index >= 0 && index < books.length) {
            Book book = books[index];

            System.out.print("Enter the price of the book: ");
            double price = scanner.nextDouble();

            System.out.print("Press 'A' to buy the book or 'B' to cancel the purchase: ");
            String choice = scanner.next();

            if (choice.equalsIgnoreCase("A")) {
                System.out.println("Congratulations! Your purchase of the book '" + book.getName() + "' is successful.");
            } else if (choice.equalsIgnoreCase("B")) {
                System.out.println("Your purchase of the book '" + book.getName() + "' is cancelled successfully.");
            } else {
                System.out.println("Invalid choice.");
            }
        } else {
            System.out.println("Invalid book index.");
        }
    }

    public void selectPenColorAndType() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the color of the pen: ");
        penColor = scanner.nextLine();

        System.out.print("Enter the type of the pen (Ballpoint or Fountain): ");
        penType = scanner.nextLine();

        System.out.println("Selected pen details:");
        System.out.println("Pen color: " + penColor);
        System.out.println("Pen type: " + penType);
        System.out.println("Price of the pen: $10");
    }

    public void buyPen() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Press 'A' to buy the pen or 'B' to cancel the purchase: ");
        String choice = scanner.next();

        if (choice.equalsIgnoreCase("A")) {
            System.out.println("Congratulations! Your purchase of the pen is successful.");
        } else if (choice.equalsIgnoreCase("B")) {
            System.out.println("Your purchase of the pen is cancelled successfully.");
        } else {
            System.out.println("Invalid choice.");
        }
    }
}
Shop project:
This Java project simulates a simple shop where users can view book details, change book attributes, buy books, select pen color and type, and buy pens. It consists of three classes: Shop, Menu, and Book.

Shop Class:
The Shop class represents the shop itself. It contains an array of books, and variables for pen color and pen type. The constructor initializes the array with two Book objects. The Shop class provides methods to view book details, change book attributes, change attributes of all books, buy a book, select pen color and type, and buy a pen.

Book Class:
The Book class represents a book in the shop. It has properties such as name, contents, hardcover status, and page count. It provides a method to display the book details and getters/setters for the properties.

Menu Class:
The Menu class handles the user interface. It presents a menu to the user with different options and executes the corresponding actions based on the user's choice. The menu is implemented using a do-while loop and a switch statement.

How to Run the Program:
To run the program, follow these steps:

Ensure you have Java installed on your system.
1. Compile all the Java files in the project using the javac command.


2. Run the Menu class using the java command.If you are using the IDE blueJ, then create and object of the menu class.
Then, run the method new Menu().

3. Follow the prompts in the menu to interact with the shop and perform various actions.

Usage
View book details: Select option 1 in the menu to display details of all available books.
Change book attributes: Select option 2 in the menu to modify the attributes of a specific book.
Change attributes of all books: Select option 3 in the menu to update the contents of all books.
Buy a book: Select option 4 in the menu to purchase a book by providing the price and confirming the purchase.
Select pen color and type: Select option 5 in the menu to choose the color and type of a pen.
Buy a pen: Select option 6 in the menu to purchase the selected pen by confirming the purchase.
Exit: Select option 0 to exit the program.
Note
This project is a simplified simulation and does not include extensive error handling or data persistence. It serves as a basic demonstration of object-oriented programming concepts and user interaction in Java.

Feel free to explore and modify the code to enhance its functionality and adapt it to your needs.

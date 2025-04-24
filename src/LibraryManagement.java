import java.util.Scanner;

// Base class
class Book {
    protected String title;
    protected String author;
    protected double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

// Derived class: Fiction
class Fiction extends Book {
    public Fiction(String title, String author, double price) {
        super(title, author, price);
    }

    public void displayDetails() {
        System.out.println("\nFiction Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

// Derived class: NonFiction
class NonFiction extends Book {
    public NonFiction(String title, String author, double price) {
        super(title, author, price);
    }

    public void displayDetails() {
        System.out.println("\nNon-Fiction Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

// Main class
public class LibraryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Book 1
        System.out.println("Book 1:");
        System.out.print("Type (Fiction/Non-Fiction): ");
        String type1 = scanner.nextLine();
        System.out.print("Title: ");
        String title1 = scanner.nextLine();
        System.out.print("Author: ");
        String author1 = scanner.nextLine();
        System.out.print("Price: ");
        double price1 = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        Book book1;
        if (type1.equalsIgnoreCase("Fiction")) {
            book1 = new Fiction(title1, author1, price1);
            ((Fiction) book1).displayDetails();
        } else {
            book1 = new NonFiction(title1, author1, price1);
            ((NonFiction) book1).displayDetails();
        }

        // Book 2
        System.out.println("\nBook 2:");
        System.out.print("Type (Fiction/Non-Fiction): ");
        String type2 = scanner.nextLine();
        System.out.print("Title: ");
        String title2 = scanner.nextLine();
        System.out.print("Author: ");
        String author2 = scanner.nextLine();
        System
import java.util.Scanner;

// Base class
class Book {
    protected String title;
    protected String author;
    protected double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
}

// Derived class: Fiction
class Fiction extends Book {
    public Fiction(String title, String author, double price) {
        super(title, author, price);
    }

    public void displayDetails() {
        System.out.println("\nFiction Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

// Derived class: NonFiction
class NonFiction extends Book {
    public NonFiction(String title, String author, double price) {
        super(title, author, price);
    }

    public void displayDetails() {
        System.out.println("\nNon-Fiction Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
}

// Main class
public class LibraryManagement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Book 1
        System.out.println("Book 1:");
        System.out.print("Type (Fiction/Non-Fiction): ");
        String type1 = scanner.nextLine();
        System.out.print("Title: ");
        String title1 = scanner.nextLine();
        System.out.print("Author: ");
        String author1 = scanner.nextLine();
        System.out.print("Price: ");
        double price1 = scanner.nextDouble();
        scanner.nextLine(); // Consume newline

        Book book1;
        if (type1.equalsIgnoreCase("Fiction")) {
            book1 = new Fiction(title1, author1, price1);
            ((Fiction) book1).displayDetails();
        } else {
            book1 = new NonFiction(title1, author1, price1);
            ((NonFiction) book1).displayDetails();
        }

        // Book 2
        System.out.println("\nBook 2:");
        System.out.print("Type (Fiction/Non-Fiction): ");
        String type2 = scanner.nextLine();
        System.out.print("Title: ");
        String title2 = scanner.nextLine();
        System.out.print("Author: ");
        String author2 = scanner.nextLine();
        System

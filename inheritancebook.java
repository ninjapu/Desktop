// 5 Write a program to create a class Publisher with attributes publisher name and 
// publisher id. Derive a subclass Book with attributes bookname, bookid and author name. 
// All these data should be entered by the user. Create two methods getdata() and 
// showdata() to display the details of book and publisher. in java 

import java.util.Scanner;

// Publisher class 
class Publisher {
    String publisherName;
    int publisherId;

    // Method to get publisher data
    void getData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Publisher Name: ");
        publisherName = scanner.nextLine();
        System.out.print("Enter Publisher ID: ");
        publisherId = scanner.nextInt();
        scanner.nextLine(); // consume the newline
    }

    // Method to display publisher data
    void showData() {
        System.out.println("Publisher Name: " + publisherName);
        System.out.println("Publisher ID: " + publisherId);
    }
}

// Book class derived from Publisher
class Book extends Publisher {
    String bookName;
    int bookId;
    String authorName;

    // Method to get book data
    @Override
    void getData() {
        super.getData();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Book Name: ");
        bookName = scanner.nextLine();
        System.out.print("Enter Book ID: ");
        bookId = scanner.nextInt();
        scanner.nextLine(); // consume the newline
        System.out.print("Enter Author Name: ");
        authorName = scanner.nextLine();
    }

    // Method to display book data
    @Override
    void showData() {
        super.showData();
        System.out.println("Book Name: " + bookName);
        System.out.println("Book ID: " + bookId);
        System.out.println("Author Name: " + authorName);
    }
}

// Main class to test the functionality
public class inheritancebook {
    public static void main(String[] args) {
        Book book = new Book();
        book.getData();
        System.out.println("\nDisplaying Book and Publisher Details:");
        book.showData();
    }
}
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

class Address {
    private String name;
    private String city;
    private String state;

    // Constructor
    public Address(String name, String city, String state) {
        this.name = name;
        this.city = city;
        this.state = state;
    }

    // toString method to display address information
    @Override
    public String toString() {
        return "Name: " + name + ", City: " + city + ", State: " + state;
    }
}

class Maillist {
    private LinkedList<Address> addressList;

    // Constructor
    public Maillist() {
        addressList = new LinkedList<>();
    }

    // Method to add address to the list
    public void addAddress(Address address) {
        addressList.add(address);
    }

    // Method to display all addresses using Iterator
    public void displayAddresses() {
        Iterator<Address> iterator = addressList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}

public class Linkedlistinput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Maillist mailList = new Maillist();

        // Loop to take user input for addresses
        while (true) {
            System.out.print("Enter Name (or type 'exit' to finish): ");
            String name = scanner.nextLine();
            if (name.equalsIgnoreCase("exit")) {
                break; // Exit the loop if the user types 'exit'
            }

            System.out.print("Enter City: ");
            String city = scanner.nextLine();

            System.out.print("Enter State: ");
            String state = scanner.nextLine();

            // Create a new Address object and add it to the mailing list
            mailList.addAddress(new Address(name, city, state));
        }

        // Display all addresses in the Maillist
        System.out.println("\nMailing List:");
        mailList.displayAddresses();

        // Close the scanner
        scanner.close();
    }
}
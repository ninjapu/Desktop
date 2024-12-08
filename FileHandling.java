// 10 File Handling Write a program to perform following actions and store output in file:  
 
// 1. Accept strings from user, convert it into uppercase and store it in a file.  
// 2. Write double value to a text file and also display the date on which the application was run      
// inside the file.  
// 3. Delete a given file or directory and display appropriate message 


import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class FileHandling {

    // Method to write user input strings in uppercase to a file
    public static void writeUppercaseToFile(String filename, Scanner scanner) {
        try (FileWriter writer = new FileWriter(filename, true)) {
            System.out.println("Enter strings to store in file (type 'exit' to stop):");
            while (true) {
                String input = scanner.nextLine();
                if ("exit".equalsIgnoreCase(input)) {
                    break;
                }
                writer.write(input.toUpperCase() + System.lineSeparator());
            }
            System.out.println("Strings written in uppercase to file: " + filename);

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Method to write a double value and date to a file
    public static void writeDoubleAndDateToFile(String filename, double value) {
        try (FileWriter writer = new FileWriter(filename, true)) {
            Date date = new Date();
            writer.write("Double Value: " + value + System.lineSeparator());
            writer.write("Date of Execution: " + date.toString() + System.lineSeparator());
            System.out.println("Double value and date written to file: " + filename);

        } catch (IOException e) {
            System.out.println("Error writing to file: " + e.getMessage());
        }
    }

    // Method to delete a file or directory (recursively)
    public static void deleteFileOrDirectory(String path) {
        File file = new File(path);

        if (!file.exists()) {
            System.out.println("File/Directory does not exist: " + path);
            return;
        }

        if (file.isDirectory()) {
            File[] files = file.listFiles();
            if (files != null) {
                for (File f : files) {
                    deleteFileOrDirectory(f.getAbsolutePath());
                }
            }
        }

        if (file.delete()) {
            System.out.println("File/Directory deleted successfully: " + path);
        } else {
            System.out.println("Failed to delete file/directory: " + path);
        }
    }

    public static void main(String[] args) {
        // Task 1: Write uppercase strings to file
        try (Scanner scanner = new Scanner(System.in)) {
            // Task 1: Write uppercase strings to file
            System.out.print("Enter the filename to store uppercase strings: ");
            String upperFilename = scanner.nextLine();
            writeUppercaseToFile(upperFilename, scanner);
            
            // Task 2: Write double and date to file
            System.out.print("Enter the filename to store double value and date: ");
            String doubleFilename = scanner.nextLine();
            System.out.print("Enter a double value to write to the file: ");
            double value = scanner.nextDouble();
            writeDoubleAndDateToFile(doubleFilename, value);
            
            // Task 3: Delete a file or directory
            scanner.nextLine(); // Consume newline
            System.out.print("Enter the path of the file/directory to delete: ");
            String deletePath = scanner.nextLine();
            deleteFileOrDirectory(deletePath);
        }
    }
}

class Calculator {
    
    // Method to add two integers
    public int addfunc(int a, int b) {
        return a + b;
    }

    // Method to add two doubles
    public double addfunc(double a, double b) {
        return a + b;
    }
}

public class methodoverloading {
    public static void main(String[] args) {
        Calculator calc = new Calculator();

        // Adding integers
        int intResult = calc.addfunc(5, 10);
        System.out.println("Sum of integers: " + intResult);

        // Adding doubles
        double doubleResult = calc.addfunc(5.5, 10.2);
        System.out.println("Sum of doubles: " + doubleResult);
        
        // Uncommenting the following line will cause a compile-time error
        // double mixedResult = calc.addfunc(5, 10.5);
    }
}
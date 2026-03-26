class Calculator {

    // Public method: adds two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Protected method: adds three integers
    protected int add(int a, int b, int c) {
        return a + b + c;
    }

    // Private method: adds two decimal numbers
    private double add(double a, double b) {
        return a + b;
    }

    // Public method to access private method
    public void displayDecimalAddition(double a, double b) {
        double result = add(a, b);
        System.out.println("Sum of decimals: " + result);
    }
}

public class Mainnn {
    public static void main(String[] args) {

        Calculator calc = new Calculator();

        // Calling public method (2 integers)
        int sum1 = calc.add(10, 20);
        System.out.println("Sum of 2 integers: " + sum1);

        // Calling protected method (3 integers)
        int sum2 = calc.add(5, 10, 15);
        System.out.println("Sum of 3 integers: " + sum2);

        // Calling public method that uses private method internally
        calc.displayDecimalAddition(2.5, 3.5);
    }
}
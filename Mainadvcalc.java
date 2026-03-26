class Calculator {

    // Public method
    public int add(int a, int b) {
        System.out.println("Base class add()");
        return a + b;
    }

    // Protected method
    protected void display() {
        System.out.println("This is Calculator display()");
    }

    // Private method
    private void show() {
        System.out.println("Private show() in Calculator");
    }

    // Public method to access private method
    public void accessPrivate() {
        show(); // calling private method
    }
}

// Derived class
class AdvancedCalculator extends Calculator {

    // Overriding add()
    @Override
    public int add(int a, int b) {
        System.out.println("AdvancedCalculator add() (modified behavior)");
        return a + b + 10; // modified logic
    }

    // Overriding display()
    @Override
    protected void display() {
        System.out.println("This is AdvancedCalculator display()");
    }

    // This is NOT overriding (because parent method is private)
    public void show() {
        System.out.println("show() in AdvancedCalculator");
    }
}

// Main class
public class Mainadvcalc {
    public static void main(String[] args) {

        // Base class object
        Calculator obj1 = new Calculator();
        System.out.println("Sum (Calculator): " + obj1.add(5, 10));
        obj1.display();
        obj1.accessPrivate();

        System.out.println("----------------------");

        // Derived class object
        AdvancedCalculator obj2 = new AdvancedCalculator();
        System.out.println("Sum (AdvancedCalculator): " + obj2.add(5, 10));
        obj2.display();
        obj2.show(); // calls its own method

        System.out.println("----------------------");

        // Runtime Polymorphism (Parent reference → Child object)
        Calculator obj3 = new AdvancedCalculator();
        System.out.println("Sum (Polymorphism): " + obj3.add(5, 10));
        obj3.display();
        obj3.accessPrivate(); // still calls parent’s private method internally
    }
}
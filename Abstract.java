abstract class Abstract {

    abstract void draw();

    void display() {
        System.out.println("This is a shape.");
    }

    public static void main(String[] args) {

        System.out.println("abstract class.");

        // Abstract s = new Abstract();  Error: Cannot instantiate abstract class
    }
}

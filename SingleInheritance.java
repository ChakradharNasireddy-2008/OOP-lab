class Person {
    void display() {
        System.out.println("I am a person.");
    }
}

class Student extends Person {
    void study() {
        System.out.println("I am studying.");
    }
}

public class SingleInheritance {
    public static void main(String[] args) {
        Student s = new Student();
        s.display();
        s.study();
    }
}
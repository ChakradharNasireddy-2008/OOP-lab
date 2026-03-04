class Student {
    int id;
    String name;

    void show() {
        System.out.println(id + " " + name);
    }
}

public class Maini {
    public static void main(String[] args) {
        Student s = new Student();
        s.id = 1;
        s.name = "Ram";
        s.show();
    }
}
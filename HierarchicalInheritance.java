class Shape {
    void draw() {
        System.out.println("Drawing shape");
    }
}

class Circle extends Shape {
    void circleInfo() {
        System.out.println("This is a circle");
    }
}

class Rectangle extends Shape {
    void rectangleInfo() {
        System.out.println("This is a rectangle");
    }
}

public class HierarchicalInheritance {
    public static void main(String[] args) {
        Circle c = new Circle();
        c.draw();
        c.circleInfo();

        Rectangle r = new Rectangle();
        r.draw();
        r.rectangleInfo();
    }
}
import java.util.Scanner;

// color interface

interface Color {
    String getColor();
}

// print interface

interface Print {
    void print();
}

// superclass for reading data from console

class SuperClass {
    private char operation;

    public void setOperation() {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter operation (+ or - or / or *): ");
        this.operation = in.nextLine().charAt(0);

        System.out.println("Result: ");

        in.close();
    }

    public char getOperaion() {
        return this.operation;
    }

}

// sub class that print result of operation

class SubClass extends SuperClass implements Print {

    private Figure a;
    private Figure b;

    //set figures

    public void setFigures(Figure a, Figure b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void print() {
        System.out.println("Figure a: " + a.area());
        System.out.println("Figure b: " + b.area());
        setOperation();
        switch (getOperaion()) {
            case '+':
                System.out.println("Answer: " + (a.area() + b.area()));
                break;
            case '-':
                System.out.println("Answer: " + (a.area() - b.area()));
                break;
            case '/':
                System.out.println("Answer: " + (a.area() / b.area()));
                break;
            case '*':
                System.out.println("Answer: " + (a.area() * b.area()));
                break;
            default:
                System.out.println("Wrong operation");
        }
    }

}

// abstract class for figures

abstract class Figure {

    // stop formatting

    public static final String RESET = "\u001B[0m";

    // 2d array of colors and codes

    public static final String[][] colors = {
            {"BLACK", "\u001B[0m"},
            {"RED", "\u001B[31m"},
            {"GREEN", "\u001B[32m"},
            {"YELLOW", "\u001B[33m"},
            {"BLUE", "\u001B[34m"},
            {"PURPLE", "\u001B[35m"},
            {"CYAN", "\u001B[36m"},
            {"WHITE", "\u001B[37m"}
    };

    abstract double area();
    abstract double linearsize();
    
    public static String setColor(String color) {
        for (String[] c : colors) {
            if (c[0].equals(color)) {
                return c[1];
            }
        }
        return null;
    }

}

// class cylinder

class Cylinder extends Figure implements Color, Print {
    private double r, h;
    private String color;

    Cylinder(double r, double h, String color) {
        this.r = r;
        this.h = h;
        this.color = color;
    }

    Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
        this.color = "YELLOW";
    }

    double area() {
        return 2 * 3.14 * r * h;
    }

    double volume() {
        return 3.14 * r * r * h;
    }

    double linearsize() {
        return 2 * 3.14 * r;
    }

    public String getColor() {
        return color;
    }

    void setR(double r) {
        this.r = r;
    }

    void setH(double h) {
        this.h = h;
    }

    public void print() {
        System.out.println("Area of cylinder is " + area());
        System.out.println("Volume of cylinder is " + volume());
        System.out.println("Linear size of cylinder is " + linearsize());
        System.out.println("Color of cylinder is " + Figure.setColor(getColor()) + getColor() + Figure.RESET);
        System.out.println();
    }
}

// class cube 

class Cube extends Figure implements Color, Print {
    private double a;
    private String color;

    Cube(double a, String color) {
        this.a = a;
        this.color = color;
    }

    Cube(double a) {
        this.a = a;
        this.color = "YELLOW";
    }

    double area() {
        return 6 * a * a;
    }

    double volume() {
        return a * a * a;
    }

    double linearsize() {
        return 4 * a;
    }

    public String getColor() {
        return color;
    }

    void setA(double a) {
        this.a = a;
    }

    public void print()
    {
        System.out.println("Area of cube is " + area());
        System.out.println("Volume of cube is " + volume());
        System.out.println("Linear size of cube is " + linearsize());
        System.out.println("Color of cube is " + Figure.setColor(getColor()) + getColor() + Figure.RESET);
        System .out.println();
    }
}

//class rectangle

class Rectangle extends Figure implements Color, Print {
    private double a, b;
    private String color;

    Rectangle(double a, double b, String color) {
        this.a = a;
        this.b = b;
        this.color = color;
    }

    Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
        this.color = "YELLOW";
    }

    double area() {
        return a * b;
    }

    double perimeter() {
        return 2 * (a + b);
    }

    double linearsize() {
        return 2 * (a + b);
    }

    public String getColor() {
        return color;
    }

    void setA(double a) {
        this.a = a;
    }

    void setB(double b) {
        this.b = b;
    }

    public void print()
    {
        System.out.println("Area of rectangle is " + area());
        System.out.println("Perimeter of rectangle is " + perimeter());
        System.out.println("Linear size of rectangle is " + linearsize());
        System.out.println("Color of rectangle is " + Figure.setColor(getColor()) + getColor() + Figure.RESET);
        System .out.println();
    }

}

// Main class

class TestFigure {
    public static void main(String args[]) {
        Figure f;
        SubClass s;
        f = new Cylinder(2, 3);
        ((Cylinder) f).setR(3);
        ((Cylinder) f).setH(4);
        ((Print) f).print();
        
        System.out.println("---------------------------------------------");

        f = new Cube(2, "GREEN");
        ((Cube) f).setA(3);
        ((Print) f).print();

        System.out.println("---------------------------------------------");

        f = new Rectangle(2, 3, "BLUE");
        ((Rectangle) f).setA(3);
        ((Rectangle) f).setB(4);
        ((Print) f).print();

        System.out.println("---------------------------------------------");

        s = new SubClass();
        s.setFigures(new Cylinder(2, 3), new Cube(2));
        s.print();

    }
}

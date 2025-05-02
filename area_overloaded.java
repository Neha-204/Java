public class area_overloaded {

    // Area of Circle
    public double area(double radius) {
        return 3.14 * radius * radius;
    }

    // Area of Rectangle
    public int area(int length, int width) {
        return length * width;
    }

    // Area of Square
    public int area(int side) {
        return side * side;
    }

    public static void main(String[] args) {
        area_overloaded calc = new area_overloaded();

        System.out.println("Area of Circle: " + calc.area(5.0));
        System.out.println("Area of Rectangle: " + calc.area(4, 6));
        System.out.println("Area of Square: " + calc.area(5));
    }
}


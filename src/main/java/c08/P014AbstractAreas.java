package c08;

abstract class P014Figure{
    double dim1;
    double dim2;

    P014Figure(double a, double b){
        dim1 = a;
        dim2 = b;
    }

    abstract double area();
}

class P014Rectangle extends P014Figure{

    P014Rectangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Inside Area for Rectangle");
        return dim1 * dim2;
    }
}

class P014Triangle extends P014Figure{

    P014Triangle(double a, double b) {
        super(a, b);
    }

    @Override
    double area() {
        System.out.println("Inside area for triangle.");
        return dim1 * dim2 / 2;
    }
}

public class P014AbstractAreas {
    public static void main(String[] args) {
        P014Rectangle r = new P014Rectangle(9,5);
        P014Triangle t = new P014Triangle(10,8);
        P014Figure figure;

        figure = r;
        System.out.println("Area is "+figure.area());

        figure = t;
        System.out.println("Area is "+figure.area());
    }
}

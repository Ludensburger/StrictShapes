public class Ellipse extends Shape {
    // TODO implement Ellipse

    private double a;
    private double b;


    public Ellipse(double a, double b, String color) throws nonZeroException, nonNegativeException {

        super(color);
        this.a = a;
        this.b = b;

        if (a == 0) {
            throw new nonZeroException("Must be a Nonzero");

        }
        if(a < 0 ) {
            throw new nonNegativeException("Must be a Non-negative");
        }

        if (b == 0) {
            throw new nonZeroException("Must be a Nonzero");

        }
        if(b < 0 ) {
            throw new nonNegativeException("Must be a Non-negative");
        }
    }

    @Override
    public double area() {
        return Math.PI * a * b;
    }

    @Override
    public double perimeter() {
        return Math.PI * (3* (a+b) - Math.sqrt((a + 3*b)*(b + 3 * a)));
    }

    @Override
    public String toString() {
        return super.toString() + " which is also an Ellipse";
    }


    // FOR CIRCLE
    public static class Circle extends Ellipse {

        public Circle(double radius, String color) throws nonNegativeException, nonZeroException {
            // TODO call super()

            super(radius, radius, color);

        }

        public String toString() {
            return super.toString() + " which is also a Circle";
        }

    }
}


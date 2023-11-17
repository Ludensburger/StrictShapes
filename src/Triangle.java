public class Triangle extends Shape {
    // TODO implement Triangle

    private double base;
    private double height;
    private double a;
    private double c;



    public Triangle(double base, double height, double a, double c, String color) throws nonZeroException, nonNegativeException {

        super(color);
        this.base = base;
        this.height = height;
        this.a = a;
        this.c = c;

        if (base == 0) {
            throw new nonZeroException("Must be a Nonzero");

        }
        if(base < 0 ) {
            throw new nonNegativeException("Must be a Non-negative");
        }

        if (height == 0) {
            throw new nonZeroException("Must be a Nonzero");

        }
        if(height < 0 ) {
            throw new nonNegativeException("Must be a Non-negative");
        }

        if (a == 0) {
            throw new nonZeroException("Must be a Nonzero");

        }
        if(a < 0 ) {
            throw new nonNegativeException("Must be a Non-negative");
        }

        if (c == 0) {
            throw new nonZeroException("Must be a Nonzero");

        }
        if(c < 0 ) {
            throw new nonNegativeException("Must be a Non-negative");
        }
    }

    @Override
    public double area() {
        return 0.5 * base * height;
    }

    @Override
    public double perimeter() {
        return a + base + c;
    }

    @Override
    public String toString() {
        return super.toString() + " which is also a Triangle";
    }

    public static class EquilateralTriangle extends Triangle {
        // TODO implement EquilateralTriangle

        public EquilateralTriangle(double side, String color) throws nonNegativeException, nonZeroException {
            // TODO call super()

            super(side, (side * Math.sqrt(3)/2), side , side, color);



        }

        public String toString() {
            return super.toString() + " which is also an Equilateral Triangle";
        }



    }
}
public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width, String color) throws nonZeroException, nonNegativeException {
        super(color);
        this.length = length;
        this.width = width;

        if (length == 0) {
            throw new nonZeroException("Must be a Nonzero");

        }
        if(length < 0 ) {
            throw new nonNegativeException("Must be a Non-negative");
        }

        if (width == 0) {
            throw new nonZeroException("Must be a Nonzero");

        }
        if(width < 0 ) {
            throw new nonNegativeException("Must be a Non-negative");
        }
    }

    @Override
    public double area() {
        return length * width;
    }

    @Override
    public double perimeter() {
        return 2 * (length + width);
    }

    @Override
    public String toString() {
        return super.toString() + " which is also a Rectangle";
    }


    // FOR SQUARE
    public static class Square extends Rectangle {

        public Square(double side, String color) throws nonNegativeException, nonZeroException {
            // TODO call super()

            super(side, side, color);

        }

        public String toString() {
            return super.toString() + " which is also a Square";
        }

    }


}

class nonZeroException extends Exception {
    public nonZeroException(String s) {
        super(s);
    }
}

class nonNegativeException extends Exception {
    public nonNegativeException(String s) {
        super(s);
    }
}
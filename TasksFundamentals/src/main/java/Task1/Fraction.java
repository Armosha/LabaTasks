package Task1;


import static java.lang.Math.sin;

public class Fraction {

    private double x;
    private double y;

    public Fraction(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public long getResult() {

        long denominator;
        long numerator;
        long result;

        denominator = (long) (2 + Math.abs(x - (2 * x / (1 + Math.pow(x, 2) * Math.pow(x, 2)))));
        if (denominator == 0) throw new ArithmeticException();

        numerator = (long) (1 + Math.pow(sin(x + y), 2));

        result = (long) (denominator / numerator + x);

        return result;
    }

}
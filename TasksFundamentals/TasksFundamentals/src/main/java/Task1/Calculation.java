package Task1;


public class Calculation {

    Fraction fraction = new Fraction(Math.random() * 10, Math.random() * 10);
    long res;

    public long cal() {
        res = fraction.getResult();
        return res;
    }

    @Override
    public String toString() {
        return "Result: " + res;
    }
}

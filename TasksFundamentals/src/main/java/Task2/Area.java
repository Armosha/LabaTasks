package Task2;

public class Area {

    private double x;
    private double y;

    public Area() {
    }
    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
    public void setX(double x) {
    }
    public void setY(double y) {
    }
    public void checkArea(double x, double y) {

        if ((Math.abs(x) <= 6 && (y <= 3) || ((Math.abs(x) <= 4 && (y <= 5)) && x != 0))) {
            System.out.println("true");
        } else System.out.println("false");

    }

}

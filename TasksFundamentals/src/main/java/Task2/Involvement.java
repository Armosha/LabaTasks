package Task2;


public class Involvement {

    Area area = new Area();

    public void checkInvolvement() {
        area.setX(Math.random() * 10);
        area.setY(Math.random() * 10);
        area.checkArea(area.getX(), area.getY());
    }
}

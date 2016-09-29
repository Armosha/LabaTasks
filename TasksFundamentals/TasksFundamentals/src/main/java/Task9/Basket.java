/*package Task9;

import java.awt.*;
import java.util.ArrayList;

public class Basket {

    private ArrayList<Ball> balls;
    double weight;

    public Basket(ArrayList<Ball> balls) {
        this.balls = balls;
    }

    public ArrayList<Ball> getBalls() {
        return new ArrayList<Ball>(balls);
    }

    public double getWeight() {
        for (Ball ball : balls) {
            weight += ball.getWeight();
        }
        return weight;
    }

    public int getColoredBalls(Color color) {
        int count = 0;
        for (Ball ball : balls) {
            if (ball.getColor() == color) {
                count++;
            }
        }
        return count;
    }

    public int getCountOfBalls() {
        return balls.size();
    }

    public void addBallToBasket(Ball ball) {
        this.balls.add(ball);
    }
}
*/
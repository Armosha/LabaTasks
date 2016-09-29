import Task6.Matrix;
import org.testng.annotations.Test;

@Test
public class TaskTest6 {
    public void outMatrix() {
        int[][] mat = Matrix.getMatrix(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9}, new int[9][9]);
    }
}

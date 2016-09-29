import Task3.Function;
import org.testng.annotations.Test;

@Test
public class TaskTest3 {

    public void checkTangens() {
        double[][] value = Function.tangCalculation(3,12,4);
        System.out.print(value[1][0]);
        System.out.println(" - " + value[0][1]);
    }
}

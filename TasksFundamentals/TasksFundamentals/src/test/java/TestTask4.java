import Task4.SortArray;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TestTask4 {

    public void checkEquals() {
        boolean prime = SortArray.isPrime(-3);
        Assert.assertTrue(prime == true);

    }

}

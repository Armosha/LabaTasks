import Task1.Fraction;
import org.testng.Assert;
        import org.testng.annotations.Test;

@Test
public class TaskTest1 {
    public void checkFraction() {
        Fraction fr = new Fraction(19,12);
        Assert.assertTrue(39 == fr.getResult());
    }
}
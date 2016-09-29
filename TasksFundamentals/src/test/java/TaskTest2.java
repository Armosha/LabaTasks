import Task2.Area;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TaskTest2 {
    public void checkArea() {
        Area ar = new Area();
        ar.checkArea(19, 12);
        Assert.assertTrue(true, "false" );
        ar.checkArea(-3, 1);
        Assert.assertTrue(true, "true" );
        ar.checkArea(0, 1);
        Assert.assertTrue(false, "false" );

    }
}


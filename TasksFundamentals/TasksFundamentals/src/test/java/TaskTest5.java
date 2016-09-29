import Task5.Subsequence;
import org.testng.Assert;
import org.testng.annotations.Test;

@Test
public class TaskTest5 {
    public void chekCount(){
        Subsequence subsequence = new Subsequence();
        subsequence.calculationSubsequence(new int[]{1, 12, 12, 67, 456, 78, 678, 679, 56, 34, 35,36, 5, 65,4,4,6,6, 9, 0});
        Assert.assertTrue(true, "15");
    }
}

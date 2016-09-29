package Task5;


public class Subsequence {

    public Subsequence(){
            }

    public int calculationSubsequence(int[]arr) {
        int k;
        int i;
        int m;
        m = arr[0];
        for (i = 0, k = 0; i < arr.length; i++) {
            if (m >= arr[i]) {
                k++;
            } else if (m < arr[i]) {
                m = arr[i];
            }
        }
        System.out.print(k);
        return k;
    }
}

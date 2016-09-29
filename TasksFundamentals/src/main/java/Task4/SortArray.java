package Task4;


public class SortArray {

    int N;
    public void sortIfPrime() {
        int[] array = new int[N];
        for (int i = 2; i < array.length; i++)
            if (isPrime(array[i]))
                System.out.println(i);
    }

    public static boolean isPrime(int n) {
        if (n == 1) return false;
        for (int i = 2; i * i <= n; i++)
            if (n % i == 0) return false;
        return true;
    }
}


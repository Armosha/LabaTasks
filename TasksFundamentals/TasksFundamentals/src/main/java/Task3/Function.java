package Task3;


public class Function {

    public static double[][] tangCalculation(double a, double b, double h) {

        double[][] arr = new double[0][];
        try {
            int length = (int) ((int) (b - a) / h);
            arr = new double[length][2];
            if (h != 0) {
                for (int i = 0; i < length; i++) {
                    for (double j = a; j <= b; j = j + h) {
                        arr[i][0] = j;
                        arr[i][1] = Math.tan(j);
                    }
                }
            } else {
                System.out.println("Input correct value");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Index out of board of array");
        }
        return arr;
    }


}
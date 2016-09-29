package Task7;


public class Shell {


    public static int[] getSort() {

        int array[] = new int[12];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round(Math.random() * 100);
            System.out.print(array[i] + " ");
        }
        int a = array.length / 2;
        while (a > 0) {
            for (int i = 0; i < (array.length - a); i++) {
                int j = i;
                while ((j >= 0) && (array[j] > array[j + a])) {
                    int temp = array[j];
                    array[j] = array[j + a];
                    array[j + a] = temp;
                    j--;
                }
            }

            a = a / 2;
        }

        System.out.println();
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        return array;
    }
}

import java.util.Arrays;

public class Deepening_In_Arrays {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        array[0][0] = 1;
        System.out.println(Arrays.deepToString(array));
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = i + j;
            }
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println(Arrays.deepToString(array));
    }
}

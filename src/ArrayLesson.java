import java.util.Arrays;

public class Array_Lesson {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 5, 6, 7, 9};
        System.out.println(arr); //посилання на область пам'яті
        System.out.println(Arrays.toString(arr)); //Вивід власних значень масиву


        int[] arr1 = new int[5];
        arr1[0] = 20;
        arr1[1] = 30;
        arr1[2] = 40;
        arr1[3] = 50;
        arr1[4]=60;

        System.out.println(arr[3]);
        System.out.println(arr[4]);
        System.out.println(arr.length);
        System.out.println(arr[arr.length-1]);

        int [][][]arr2 = new int[3][3][3];
        System.out.println(Arrays.deepToString(arr2));
    }


}


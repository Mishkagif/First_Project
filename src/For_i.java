import java.util.Scanner;

public class For_i {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 9};
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 3;
            System.out.println(arr[i]);



            int[] arr1 = {15, 9, 8, 7};
            for (int k : arr1) {
                System.out.println(k);



            }

            Scanner scan =new Scanner(System.in);
            while (true){
                String line=scan.nextLine();
                if (line.equalsIgnoreCase("stop") || line.equals("")){
                    break;



                }
                System.out.println(line);
            }

        }

    }


}

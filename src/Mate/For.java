import java.util.Scanner;

public class For {
    public static void main(String[] args) {
        int[] arr = {1, 4, 6, 7, 9};
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 3;
          if (arr[i]%2!=0)continue;
            System.out.println(arr[i]);

            // Ітератор
            int[] arr1 = {15, 9, 8, 7};
            for (int k : arr1) {
                System.out.println(k);

            }

           //Цикл while
            Scanner scan =new Scanner(System.in);
            while (true){
                String line=scan.nextLine();
                if (line.equalsIgnoreCase("stop") || line.equals("")){
                    break;
                }
                System.out.println(line);
            }

          // Цикл Do-while
            Scanner scan1 =new Scanner(System.in);
            int values=5;
            do {
                System.out.println("Введіть новк число...");
values+=scan1.nextInt();
                System.out.println("Поточне значення:"+values);
            }while (values<200);

        }

    }


}

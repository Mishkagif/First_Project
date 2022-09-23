import java.util.Scanner;

public class Input_Output {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scan.nextLine();
        System.out.print("Enter your age:");
        int age = scan.nextInt();

        System.out.printf("Name: %s, Age: %d ", name, age);




    }


}

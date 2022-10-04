import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int age = scan.nextInt();

        if (age >= 18) {
            System.out.println("Вам 18 або більше  років");
        } else if (age >= 16) {
            System.out.println("Вам  16 або більше  років");
        } else {
            System.out.println("Вам менше 16  років");
        }

    }


}

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String city = scan.next();
        switch (city) {
            case "Kyiv": {
                System.out.println("Столиця");
                break;
            }
            case "Lviv": {
                System.out.println("Захід");
                break;

            }
            case "Kharkiv": {
                System.out.println("Схід");
                break;
            }
            default:
                System.out.println("Інше місто");
        }
    }
}
import java.util.Scanner;

public class EnhancedSwitch {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String cities=scan.next();

        switch (cities){
            case "Kyiv"-> System.out.println("Столиця");
            case "Lviv"-> System.out.println("Захід");
            case "Kharkiv"-> System.out.println("Схід");
            default -> System.out.println("Інше місто");

        }
    }

}

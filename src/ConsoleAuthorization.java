import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ConsoleAuthorization {
    public static void main(String[] args) {
        Map<String, String> users = new HashMap<>();
        users.put("Alex", "123qer");
        users.put("john", "password");
        users.put("Admin", "root");

        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your username:");
        String login = scan.nextLine();

        if (users.containsKey(login)) {
            System.out.print("Enter your password:");
            String password = scan.nextLine();

            while (true) {
                if (password.equals("")) {
                    System.out.println("Wrong password.The authorization process has been stopped");
                    break;
                }

                if (users.get(login).equals(password)) {
                    System.out.println("Success!, Welcome");
                    break;
                }

                System.out.println("Password wrong! Enter password again");
                password = scan.nextLine();
            }
        } else {
            System.out.println("Sorry, this user doesn't exist");
        }
    }
}


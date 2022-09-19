import java.time.LocalDate;

public class String_study {
    public static void main(String[] args) {

        String name = "Mishka";
        int newMails = 34;
        String str1 = String.format("Привіт %s, у тебе %d нових повідомлень Сьогодні %s", name, newMails, LocalDate.now());
        System.out.println(str1);
    }
}

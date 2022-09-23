import java.util.Random;

public class Random_Homework {
    public static void main(String[] args) {
        Random random =  new Random();
        int number = 0 + random.nextInt(100);
        System.out.println(number);
    }
}

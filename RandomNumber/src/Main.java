import java.util.Random;

public class Main{
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(6)+1;
        System.out.println(n);
    }
}
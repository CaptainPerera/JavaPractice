import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input first number: ");
        double num1 = in.nextDouble();
        System.out.print("Input second number: ");
        double num2 = in.nextDouble();

        double sum = num1 + num2;
        double sub = num1 - num2;
        double mul = num1 * num2;
        double div = num1 / num2;
        double mod = num1 % num2;

        System.out.println(num1+" + "+num2+" = "+sum);
        System.out.println(num1+" - "+num2+" = "+sub);
        System.out.println(num1+" * "+num2+" = "+mul);
        System.out.println(num1+" / "+num2+" = "+div);
        System.out.println(num1+" mod "+num2+" = "+mod);
    }
}

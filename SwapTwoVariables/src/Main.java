import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a,b,temp;
        System.out.print("Enter a = ");
        a = input.nextInt();
        System.out.print("Enter b = ");
        b = input.nextInt();
        System.out.println("Before swap:");
        System.out.println("a = "+a+" b = "+b);

        temp = a;
        a = b;
        b = temp;

        System.out.println("After swap:");
        System.out.println("a = "+a+" b = "+b);


    }
}

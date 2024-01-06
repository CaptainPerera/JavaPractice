import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        n = input.nextInt();
        String[] cars = new String[n];
        for(int i = 0; i<n; i++){
            System.out.print("Enter name of cars you wanna add: ");
            cars[i] = input.next();
        }
        System.out.println("Items of the array are: ");
        for(int i = 0; i<=n; i++){
            System.out.println(cars[i]);
        }
    }
}

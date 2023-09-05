import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r, area, perimeter;
        System.out.print("Radius: ");
        r = input.nextDouble();
        area = Math.PI*Math.pow(r,2);
        perimeter = 2*Math.PI*r;
        System.out.println("Area: "+area);
        System.out.println("Perimeter: "+perimeter);
    }
}

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double value, result=0.0;
        int op;
        boolean x = true;
        do{
            System.out.println("Main Menu:");
            System.out.println("1. Celsius to Ferenheit");
            System.out.println("2. Ferenheit to Celsius");
            System.out.println("3. Exit");
            System.out.print("Choose your option:");
            op = input.nextInt();
            switch(op){
                case 1:
                    System.out.print("Enter Celsius Value: ");
                    value = input.nextDouble();
                    result = (value*9/5)+32;
                    System.out.println(value+" Celsius is "+ result + " Ferenheit");
                    break;
                case 2:
                    System.out.print("Enter Ferenheit Value: ");
                    value = input.nextDouble();
                    result = (value-32)*5/9;
                    System.out.println(value+" Ferenheit is "+ result + " Celsius");
                    break;
                case 3:
                    x = false;
                    break;
                default:
                    System.out.println("Invalid input");
                    break;
            }
        }while(x);
    }
}

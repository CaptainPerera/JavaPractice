import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> food= new ArrayList<>();

        food.add("Pizza");
        food.add("Hamburger");
        food.add("Kottu");

//        food.set(0, "Fried Rice");
//        food.remove(2);
//        food.clear();


        for (String i : food) {
            System.out.println(i);
        }
    }
}

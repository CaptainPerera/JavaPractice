public class Main {
    public static void main(String[] args) {

        //String[][] cars = {
        //                      {"Tesla", "Corvette", "Silverado"},
        //                      {"Mustang", "Toyota", "Ferrari"},
        //                      {"Lambo", "Suzuki", "F-150"}
        //                   }

        String[][] cars = new String[3][3];

        cars[0][0] = "Tesla";
        cars[0][1] = "Corvette";
        cars[0][2] = "Silverado";
        cars[1][0] = "Mustang";
        cars[1][1] = "Toyota";
        cars[1][2] = "Ferrari";
        cars[2][0] = "Lambo";
        cars[2][1] = "Suzuki";
        cars[2][2] = "F-150";

        for (int i=0; i<cars.length; i++){
            System.out.println();
            for (int j=0; j<cars[i].length; j++){
                System.out.print(cars[i][j]+" ");
            }

        }
    }
}

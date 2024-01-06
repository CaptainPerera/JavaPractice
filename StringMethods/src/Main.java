public class Main {
    public static void main(String[] args) {
        String name = "umeen";

        //boolean result = name.equalsIgnoreCase("Umeen"); //comparing strings
        //int result = name.length(); get the length of a string
        //char result = name.charAt(0);
        //int result = name.indexOf("u");
        //boolean result = name.isEmpty();
        //String result = name.toLowerCase();
        //String result = name.toUpperCase();
        //String result = name.trim();3
        String result = name.replace("u", "G");


        System.out.println(result);
    }
}

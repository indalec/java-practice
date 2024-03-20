public class Main {
    public static void main(String[] args) {

       /* for(int i = 0; i<=9; i++){
            int x = 1;
            System.out.print(x); */


        //something -> SoMeThInG
        String input = "something";
        StringBuilder output = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char c = input.charAt(i);
            if (i % 2 == 0) {
                output.append(Character.toUpperCase(c));
            } else {
                output.append(Character.toLowerCase(c));
            }
        }

        //In Java, output.append() is a method used with the StringBuilder class to add characters or strings
        // to the end of a mutable sequence of characters. Each time you call output.append(),
        // you’re adding a new character or string to the existing StringBuilder named output.
        // THis allows you to build up a string piece by piece without creating multiple string objects.

        System.out.println(output.toString());

    }
}
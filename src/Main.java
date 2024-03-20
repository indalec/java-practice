public class Main {
    public static void main(String[] args) {

       /* for(int i = 0; i<=9; i++){
            int x = 1;
            System.out.print(x); */

        String item = "cool";
        int times = 3;
        String[] result = new String[times]; //This is the array

        for (int i = 0; i < times; i++) {
            result[i] = item; //assignment operation: you're saying that position "i" of the array will be filled with the content of the String "item"
            System.out.print(result[i] + " ");
        }

    }
}
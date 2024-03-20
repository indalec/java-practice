public class Main {
    public static void main(String[] args) {

       /* for(int i = 0; i<=9; i++){
            int x = 1;
            System.out.print(x); */

        /*Task 13:
noDuplicates([1, 4, 4, 7, 7, 7]) ➞ [1, 4, 7]*/

        int[] numbers = {1, 4, 4, 7, 7, 7}; //Array with the numbers
        int[] temp = new int[numbers.length]; //Array where you just say it has the length of the array "numbers". It will store the not duplicate numbers
        int size = 0;

        for (int i = 0; i < numbers.length; i++) { //i<6 in that case
            boolean isDuplicate = false;
            for (int j = 0; j < size; j++) { //this happens only when you add 1 to the counter "size".
                if (numbers[i] == temp[j]) {//If the content of the position "i" in he array "numbers" is the same as the content of the
                                            // position "j" in the array "temp", then:
                    isDuplicate = true;
                    break;
                }
            }

            if (!isDuplicate) {
                temp[size++] = numbers[i];
            }
        }

        int[] noDuplicates = new int[size];
        for (int i = 0; i < size; i++) {
            noDuplicates[i] = temp[i];
        }

        
        System.out.print("[");
        for (int i = 0; i < noDuplicates.length; i++) {
            System.out.print(noDuplicates[i]);
            if (i < noDuplicates.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
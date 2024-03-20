public class Main {
    public static void main(String[] args) {

       /* for(int i = 0; i<=9; i++){
            int x = 1;
            System.out.print(x);
        }*/

        /*Task 11:
Vowel (aeiou) counter:
Ali -> 2
Nancy -> 1*/

        String[] names = new String[2];
        names[0] = "Ali";
        names[1] = "Nancy";
        String vowels = "aeiouAEIOU";

        for (int i = 0; i < names.length; i++) {
            int count = 0;
            for (int j = 0; j < names[i].length(); j++) {
                if (vowels.indexOf(names[i].charAt(j)) > -1) {
                    count++;
                }
            }
            System.out.println("Vowel counter:");
            System.out.println(names[i] + " -> " + count);


            //names[i]: This is the current string from the array of names that we’re examining.

            //.charAt(j): This method is used to get the character at position j in the string names[i].

            //vowels.indexOf(...):  This method is called on the string vowels, which contains all the vowel characters.
            //                      It returns the index within this string of the first occurrence of the specified character.
            //                      If the character is not found, then indexOf returns -1.

            //if (...) > -1:    This checks if the result of vowels.indexOf(names[i].charAt(j)) is greater than -1.
            //                  If it is, it means the character is a vowel because it was found in the vowels string.
        }
    }
}

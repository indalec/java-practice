import java.util.Random;

public class Main {


    public static void main(String[] args) {

       /* for(int i = 0; i<=9; i++){
            int x = 1;
            System.out.print(x); */

        /*Task 15 (advance):
Create password generator, the program should generate passwords
 that are 8 characters length and it must contain at least one chr of
   (0-9), (!,$,&,@,?), (a,z), (A,Z)*/


        System.out.println("Generated Password: " + generatePassword());
    }

    public static String generatePassword() {
        String numbers = "0123456789";
        String specialChars = "!$&@?";
        String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
        String upperCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String combinedChars = numbers + specialChars + lowerCaseLetters + upperCaseLetters;
        Random random = new Random();
        StringBuilder password = new StringBuilder(8);

        // Ensure at least one character from each category is included
        password.append(numbers.charAt(random.nextInt(numbers.length())));
        password.append(specialChars.charAt(random.nextInt(specialChars.length())));
        password.append(lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length())));
        password.append(upperCaseLetters.charAt(random.nextInt(upperCaseLetters.length())));

        // Fill the remaining characters
        for (int i = 4; i < 8; i++) {
            password.append(combinedChars.charAt(random.nextInt(combinedChars.length())));
        }

        // Shuffle the characters for randomness
        char[] pwdArray = password.toString().toCharArray();
        for (int i = 0; i < pwdArray.length; i++) {
            int randomIndex = random.nextInt(pwdArray.length);
            char temp = pwdArray[i];
            pwdArray[i] = pwdArray[randomIndex];
            pwdArray[randomIndex] = temp;
        }

        return new String(pwdArray);
    }
}
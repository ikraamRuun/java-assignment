import java.util.Scanner;

public class CountCharacter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String jumlad = input.nextLine();

        System.out.println("Uppercase letters: " + countUpperCase(jumlad));
        System.out.println("Lowercase letters: " + countLowerCase(jumlad));
        System.out.println("Digits: " + countDigits(jumlad));
        System.out.println("Special characters: " + countSpecialChars(jumlad));
    }

    public static int countUpperCase(String sentence) {
        int count = 0;
        for (int i = 0; i < sentence.length(); i++) {
            char ch = sentence.charAt(i);
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }
        return count;
    }
    public static int countLowerCase(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isLowerCase(ch)) {
                count++;
            }
        }
        return count;
    }

    public static int countDigits(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (Character.isDigit(ch)) {
                count++;
            }
        }
        return count;
    }

    public static int countSpecialChars(String text) {
        int count = 0;
        for (int i = 0; i < text.length(); i++) {
            char ch = text.charAt(i);
            if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
                count++;
            }
        }
        return count;
}
}

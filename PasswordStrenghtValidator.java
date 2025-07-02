import java.util.Scanner;

public class PasswordStrenghtValidator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("please Enter your password: ");
        String userpassword = input.nextLine();

        if (isLongEnough(userpassword) && hasUpperCase(userpassword) &&
                hasLowerCase(userpassword) && hasDigit(userpassword) &&
                hasSpecialChar(userpassword)) {
            System.out.println("Password is strong.");
        } else {
            System.out.println("Password is weak. Please follow all the rules.");
        }
    }

    public static boolean isLongEnough(String password) {
        return password.length() >= 8;
    }

    public static boolean hasUpperCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isUpperCase(ch)) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasLowerCase(String password) {
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isLowerCase(ch)) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasDigit(String password) {
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isDigit(ch)) {
                return true;
            }
        }
        return false;
    }
    public static boolean hasSpecialChar(String password) {
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (!Character.isLetterOrDigit(ch)) {
                return true;
            }
        }
        return false;
}
}

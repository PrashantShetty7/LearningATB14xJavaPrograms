package Java_Practice_Programs;
import java.util.*;

public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();

        if (isPalindrome(inputString)) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }

        scanner.close();
    }

    public static boolean isPalindrome(String str) {
        // Normalize the string: convert to lowercase and remove non-alphanumeric characters
        String cleanedString = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();

        // Reverse the cleaned string
        String reversedString = new StringBuilder(cleanedString).reverse().toString();

        // Compare the cleaned string with its reversed version
        if (cleanedString.equals(reversedString)) {
            return true;
        } else {
            return false;
        }
    }
}

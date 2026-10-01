import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the text?");
        String text = scanner.nextLine();
        if (isPalindrome(text)) {
            System.out.println("Your text is a palindrome");
        }
        else {
            System.out.println("Your text is not a palindrome");
        }

    }
    public static boolean isPalindrome(String text) {
        int length = text.length();
        for (int i = 0; i < length/2; i++) {
            if (text.charAt(i) != text.charAt(length -1-i)) {
                return false;
            }
        }
        return true;
    }
}

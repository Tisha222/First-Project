import java.util.ArrayList;
import java.util.Scanner;
public class LongestString {
    public static void main(String[] args) {
        ArrayList<String> text = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int len = 0;
        String word = "";
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter a string");
            text.add(scanner.nextLine());
        }
        for (int i = 0; i < 5; i++) {
            if (text.get(i).length() > len) {
                len = text.get(i).length();
                word = text.get(i);
            }
        }
        System.out.println("The string that contains the largest number of characters is " + word);

    }
}

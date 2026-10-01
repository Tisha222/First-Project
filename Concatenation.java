import java.util.Scanner;
public class Concatenation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the first string?");
        String first = scanner.nextLine();
        System.out.println("What is the second string");
        String second = scanner.nextLine();
        System.out.println("Your concatenation is " + first + second);
    }
}

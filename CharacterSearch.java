import java.util.Scanner;
public class CharacterSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your text?");
        String text = scanner.nextLine();
        System.out.println("What is the character you want to search for?");
        char target = scanner.next().charAt(0);
        int result = countSearch(text, target);
        System.out.println("The number of of times the searched character occurs is " + result);
        for (int i = 0; i < text.length()-1; i++) {
            
        }
    }

    public static int countSearch(String text, char target) {
        int count = 0;
        for (int i = 0; i<text.length(); i++) {
            if (text.charAt(i) == target) {
                count++;
            }
        }
        return count;
    }
}

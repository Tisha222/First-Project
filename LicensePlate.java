import java.util.Scanner;
public class LicensePlate {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String license = "";
        while (true) { 
            System.out.println("What is your license plate?");
            license = scanner.nextLine();
            if (isValidLicense(license)) {
                System.out.println("License is valid.");
                break;
            }
            else {
                System.out.println("License is not valid.");
            }
        }
    }

    public static boolean isValidLicense(String s) {
        if (s.length() < 3) {
            return false;
        }
        char first = s.charAt(0);
        char last = s.charAt(s.length()-1);
        if (Character.isLowerCase(first) || Character.isLowerCase(last)) {
            return false;
        }
        int yesDigit = 0;
        for (int i = 0; i < s.length()-1; i++) {
            char c = s.charAt(i);
            if (Character.isDigit(c)) {
                yesDigit +=1;
            }
            
        }
        if (yesDigit > 0) {
            return true;
        }
        else {
            return false;
        }
        

    }
}

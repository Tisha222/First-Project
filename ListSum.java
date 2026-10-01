import java.util.ArrayList;
import java.util.Scanner;
public class ListSum {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        int sum = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i<=10; i++) {
            System.out.println("Enter a number");
            num.add(scanner.nextInt());
        }
        System.out.println("Your list of numbers are " + num);
        for (int n : num) {
            sum += n;
        }
        System.out.println("Your total sum is " + sum);


    }
}

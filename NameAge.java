import java.util.Scanner;
public class NameAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your name?");
        String name = scanner.nextLine();
        System.out.println("What is your age?");
        int age = scanner.nextInt();
        if (age != 1) {
            System.out.println("Your name is " + name + " and you are " + age + " years old!");
        }
        else {
            System.out.println("Your name is " + name + " and you are " + age + " year old!");
        }



    }
}

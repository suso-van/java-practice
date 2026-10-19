import java.util.Scanner;
public class Alphabet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a character: ");
        char ch = scanner.next().charAt(0);

        if(ch >= 'a' && ch <= 'z') {
            System.out.println(ch + " is a lowercase letter.");
        } else if(ch >= 'A' && ch <= 'Z') {
            System.out.println(ch + " is an uppercase letter.");
        } else {
            System.out.println(ch + " is not an alphabet.");
        }
    }

}

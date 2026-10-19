import java.util.Scanner;
public class Loops {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);
        while(n > 0) {
            System.out.println("Current number: " + n);
            n--;
        }
        do {
            System.out.println("Current number in do-while loop: " + n);
            n++;
        } while(n <= 5);
    }
}

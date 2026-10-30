import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        sum();
        int result = sum2();
        System.out.println("The sum is: " + result);
    }
    static int sum2(){ // return the value of sum to main method
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int sum = num1 + num2;
        return sum;
    }
    static void sum(){ // void method does not return any value to main method
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number: ");
    int num1 = scanner.nextInt();
    System.out.print("Enter second number: ");
    int num2 = scanner.nextInt();
    int result = num1 + num2;
    System.out.println("The sum is: " + result);
    }
}
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your salary: ");
        int salary = scanner.nextInt();
        if(salary > 25000) {
            System.out.println("You are eligible for a bonus.");
        } 
        else if(salary == 25000) {
            System.out.println("You are eligible for a bonus.");
        }
        else {
            System.out.println("You are not eligible for a bonus.");
        }
    }
}

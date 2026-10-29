import java.util.Scanner;
public class Nested {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        switch (n) {
            case 1:
                System.out.println("One");
                System.out.print("Enter a nested number (1 or 2): ");
                int nested = scanner.nextInt();
                switch (nested) {
                    case 1:
                        System.out.println("Nested One");
                        break;
                    case 2:
                        System.out.println("Nested Two");
                        break;
                    default:
                        System.out.println("Invalid nested number");
                }
                break;
            case 2:
                System.out.println("Two");
                System.out.print("Enter a nested number (1 or 2): ");
                int nested2 = scanner.nextInt();
                switch (nested2) {
                    case 1:
                        System.out.println("Nested One");
                        break;
                    case 2:
                        System.out.println("Nested Two");
                        break;
                    default:
                        System.out.println("Invalid nested number");
                }
                break;
            case 3:
                System.out.println("Three");
                System.out.print("Enter a nested number (1 or 2): ");
                int nested3 = scanner.nextInt();
                switch (nested3) {
                    case 1:
                        System.out.println("Nested One");
                        break;
                    case 2:
                        System.out.println("Nested Two");
                        break;
                    default:
                        System.out.println("Invalid nested number");
                }
                break;
            default:
                System.out.println("Invalid number");
        }
    }
}

import java.util.Scanner;
public class Switch1 {
   public static void main(String[] args) {
        System.out.print("Enter a number  1 to 5 for week days and 6 and 7 for weekend days: ");
        Scanner scanner = new Scanner(System.in);
        int day = scanner.nextInt();
        switch (day) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Weekday");
                break;
            case 6:
            case 7:
                System.out.println("Weekend");
                break;
            default:
                System.out.println("Invalid day");
        }
    }
}

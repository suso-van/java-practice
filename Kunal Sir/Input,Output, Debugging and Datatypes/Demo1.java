import java.util.Scanner;

public class Demo1 {
     public static void main(String[] args) {
         System.out.println("Name: ");
         Scanner input = new Scanner(System.in);
            String name = input.nextLine();
            System.out.println("Hello, " + name + "!");
   }
}
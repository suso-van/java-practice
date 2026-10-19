 import java.util.Scanner;
 public class Inputs {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your roll number: ");
        int rollno = sc.nextInt();
        System.out.println("Roll Number: " + rollno);
        
        int a = 10;
        System.out.println("Value of a: " + a);

        String name = "Susovan";
        System.out.println("Name: " + name);

        System.out.print("Enter a float value: ");
        float b = sc.nextFloat();
        System.out.println("Value of b: " + b);

    }
}

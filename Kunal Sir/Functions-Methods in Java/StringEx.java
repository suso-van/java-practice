import java.util.Scanner;
public class StringEx {
    public static void main(String[] args) {
        greet();
        String result = greet();
        System.out.println(result);
    }
    static String greet(){
        String greeting = "How are you?";
        return greeting;
    }
}
public class Basics {
    public static void main(String[] args) {
        int a = 10;
        if(a > 5) {
            System.out.println("a is greater than 5");
        } else {
            System.out.println("a is not greater than 5");
        }
        int count = 1;
        while(count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }
        for(int i = 1; i <= 5; i++) {
            System.out.println("i: " + i);
        }
        do {
            System.out.println("This will execute at least once");
        } while(false);
    }
}


// sum.java
import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter how many numbers to add: ");
        int n = sc.nextInt();

        int sum = 0;
        System.out.println("Enter " + n + " numbers:");
        for (int i = 0; i < n; i++) {
            sum += sc.nextInt();
        }

        System.out.println("Sum = " + sum);
        sc.close();
    }
}

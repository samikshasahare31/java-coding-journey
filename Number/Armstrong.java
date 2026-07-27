
import java.util.Scanner;

public class Armstrong {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = s.nextInt();
        int temp = n;
        int sum = 0;
        int rem;
        while (n > 0) {
            rem = n % 10;
            sum = sum + (rem * rem * rem);
            n = n / 10;
        }
        if (sum == temp) {
            System.out.println("Armstrong");
        } else {
            System.out.println("Not Armstrong");

        }
    }
}

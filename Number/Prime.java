
import java.util.Scanner;

class Prime {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n = s.nextInt();
        if (n <= 1) {
            System.out.println("Not Prime");
        }
        int c = 0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                c++;
            }
        }
        if (c > 0) {
            System.out.println("Not Prime");
        } else {
            System.out.println("Prime");
        }
    }
}

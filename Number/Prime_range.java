import java.util.Scanner;

class Prime_range {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the starting number:");
        int start = s.nextInt();

        System.out.println("Enter the ending number:");
        int end = s.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + " are:");

        for (int n = start; n <= end; n++) {

            if (n <= 1) {
                continue;
            }

            int c = 0;

            for (int i = 2; i < n; i++) {
                if (n % i == 0) {
                    c++;
                }
            }

            if (c == 0) {
                System.out.print(n + " ");
            }
        }
    }
}
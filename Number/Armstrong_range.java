
import java.util.Scanner;

class Armstrong_range {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the starting number:");
        int start = s.nextInt();

        System.out.println("Enter the ending number:");
        int end = s.nextInt();

        System.out.println("Armstrong numbers are:");
        for (int i = start; i < end; i++) {
            int temp = i;
            int sum = 0;
            int rem;
            while (temp > 0) {
                rem = temp % 10;
                sum = sum + (rem * rem * rem);
                temp = temp / 10;
                   
                    }
                
            
                if (sum==i){
                System.out.println(i);
        }
    }
}
}

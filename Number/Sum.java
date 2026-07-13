
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= s.nextInt();
        int sum =0;
        for(int i=0;i<=n;i++){
            sum=sum+i;
           
        }

         System.out.print("Sum is :"+sum);
    }
    
}

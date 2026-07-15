
import java.util.Scanner;

public class Threegreatest {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n1=s.nextInt();
        System.out.println("Enter the second number:");
        int n2=s.nextInt();
        System.out.println("Enter the third number:");
        int n3=s.nextInt();
        if(n1> n2 && n1 > n3 ){
            System.out.println(n1+" is Greatest number ");
        }else if(n2 > n3 && n2 > n3){
            System.out.println(n2+" is Greatest number ");
        }else{
            System.out.println(n3+" is Greatest number ");
            
        }

    }
}

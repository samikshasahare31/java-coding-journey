
import java.util.Scanner;

class Positive_Negative{
    public static void main(String[] args) {
        
   
    Scanner s = new Scanner(System.in);
    System.out.println("Enter the numeber:");
    int n = s.nextInt();
    if(n > 0){
        System.out.println("The number is Positive");
    }else if (n < 0){
        System.out.println("The number is Negative");
    }else{
        System.out.println("The number is Zero ");
    }
 }
}
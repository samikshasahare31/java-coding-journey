import java.util.Scanner;

class Twogreatest{
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int n1= s.nextInt();
        System.out.println("Enter the first number:");
        int n2=s.nextInt();
        if(n1 > n2){
            System.out.println(n1+" 5is greatest number");
        }else{
            System.out.println(n2+" is greatest number");

        }
    }
}
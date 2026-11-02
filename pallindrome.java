import java.util.Scanner;

public class pallindrome {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.print("Enter a number n:");
         int n=sc.nextInt();
         int original=n;
         int rev=0;
         while(n>0){
            int digit=n%10;
            rev=rev*10+digit;
            n/=10;
         }
         if(original==rev){
            System.out.print("It is a pallindrome number:");
         }else{
            System.out.print("it is not a pallindrome number:");
         }
    }
}

import java.util.Scanner;

public class sumevenorodd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number n:");
        int n=sc.nextInt();
        int evensum=0;
        int sumodd=0;
        while(n>0){
            int digit=n%10;
            if(digit%2==0){
                evensum+=digit;
            }else{
                sumodd+=digit;
            }
            n/=10;
        }
        System.out.print("Evensum is:"+evensum);
        System.out.println("sumodd is:"+sumodd);
    }
}

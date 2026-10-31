import java.util.Scanner;

public class multiplicationtable {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number n:");
        int n=sc.nextInt();
        for(int i=5;i<=n;i+=5){
            System.out.print(i+" ");
        }

    }
}

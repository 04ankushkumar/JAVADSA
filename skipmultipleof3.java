import java.util.Scanner;

public class skipmultipleof3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number n:");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%3==0){
                continue;
            }
            System.out.print(i+" ");
        }
    }
}

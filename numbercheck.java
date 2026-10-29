import java.util.Scanner;

public class numbercheck {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a first number a:");
        int a=sc.nextInt();
        System.out.print("Enter a second number b:");
        int b=sc.nextInt();
        if(a>b){
            System.out.print("a is greatar");
        }else if(b>a){
            System.out.print("b is greater");
        }else if(a==b){
            System.out.print("Both are equal");
        }else{
            System.out.print("Both are differents");
        }
    }
}

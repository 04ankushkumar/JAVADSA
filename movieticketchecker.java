import java.util.Scanner;

public class movieticketchecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number age:");
        int age=sc.nextInt();
        if(age<5){
            System.out.print("He is adult so price is :"+0);
        }else if(age>=60){
            System.out.print("price is:"+200);
        }else{
            System.out.print("he paid fully price");
        }
    }
}

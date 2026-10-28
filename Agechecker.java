import java.util.Scanner;

public class Agechecker {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number age:");
        int age=sc.nextInt();
        if(age>=18){
            System.out.print("you are eligible to voting for mlc election");
        }else{
            System.out.println("you are eligible to voting for mlc election");
        }
         sc.close();
    }
}

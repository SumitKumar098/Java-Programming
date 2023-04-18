import java.util.Scanner;
public class IfElse {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
        if(age<20){
            System.out.println("You are a boy");
        }
        else if(age==20){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("You are a grown man");
        }
    }
}

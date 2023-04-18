import java.util.Scanner;
public class UserInput {
    public static void main(String[] args){
    Scanner scan=new Scanner(System.in);
    System.out.println("enter the number:");
    int num1=scan.nextInt();
    System.out.println("Enter the second number:");
    int num2=scan.nextInt();
    int sum=num1+num2;
    System.out.println(sum);

    System.out.println("Enter your name:");
    String input=scan.nextLine();
    System.out.println(input);
}
}

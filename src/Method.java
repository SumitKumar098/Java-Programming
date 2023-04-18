import java.util.Scanner;
public class Method {
    static int sum(int a, int b){
        return a+b;
    }

    static int cal(int a,int b){
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);

        return 0;
    }
    public static void main(String[] args){
        System.out.println(sum(4,8));
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the num1 & num2:");
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        cal(num1,num2);
    }
}

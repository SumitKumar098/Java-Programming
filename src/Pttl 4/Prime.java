import java.util.Scanner;

public class Prime{
    public static void check(int num){
        int i;
        for(i=1;i<=num;i++){
            if(i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
    public static void main(String[] args){
        int num;
        System.out.println("Enter the range=");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        check(num);
    }
}

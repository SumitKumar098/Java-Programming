import java.util.Scanner;
public class TryCatch {
    public static void main(String[] args){
        try{
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number:")
            int num=sc.nextInt();
            System.out.println(num);

        }
        catch(Exception e){
            System.out.println(e);
        }
    }
}

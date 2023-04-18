import java.util.*;

public class Data{
     int age[]=new int[100];
     int salary[]=new int[100];
    int entry;
    int i;
    String name[]=new String[100];
    public void person(){
        Scanner sc=new Scanner(System.in);
        System.out.print("enter number of entries = ");
         entry=sc.nextInt();
        for(i=1;i<=entry;i++){
            System.out.print("Enter the age = ");
             age[i]=sc.nextInt();
            System.out.print("Enter Name = ");
             name[i]=sc.next();
            System.out.print("Enter Salary is sumit = ");
            salary[i]=sc.nextInt();
        }
        System.out.println("Name "+" Age "+" Salary");
        for(i=1;i<=entry;i++){
        System.out.println(name[i] +" "+age[i]+" "+salary[i]);
        }
    }
    public static void main(String[] args){
        Data d=new Data();
        d.person()
    }
}

class Student{
    String name;
    String branch;
    public void details(){
        System.out.println(this.name);
        System.out.println(this.branch);
    }
    Student(){
        System.out.println("This is a constructor");
    }
}
public class constuctor {
    public static void main(String[] args){
    Student stud=new Student();
    stud.name="Sumit Kumar";
    stud.branch="CE";

    stud.details();
    }
}

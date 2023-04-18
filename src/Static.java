class College{
    String name;
    static String branch;
    public static void room(){
        System.out.println("Room number:408");
    }
}
public class Static {
    public static void main(String[] args){
    College c1=new College();
    College.branch="Computer Engineering";
    c1.name="Sumit";
    College.room();
    System.out.println(College.branch);
    }
}

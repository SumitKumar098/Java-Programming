class Emp{
    String name;
    int id;
    Emp(String name,int id){
        this.name=name;
        this.id=id;
    }
    public void print(){
        System.out.println(this.name);
        System.out.println(this.id);
    }
}
public class ParaConstruct {
    public static void main(String[] args){
        Emp emp1=new Emp("Sumit",3423);
        emp1.print();

    }
}

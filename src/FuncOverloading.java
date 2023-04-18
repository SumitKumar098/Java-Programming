class func{
    String name;
    int age;
    public void print(String name){
        System.out.println(name);
    }
    // public int print(String name){
    //     return name;
    // }
    public void print(String name,int age){
        System.out.println(name+age);
    }
}
public class FuncOverloading {
    public static void main(String[] args){
        func f1=new func();
        f1.name="Sumit";
        f1.age=34;
        f1.print(f1.name);
    }
}

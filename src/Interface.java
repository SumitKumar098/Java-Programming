interface Animal{
    public void walk();
}
interface Cattle{
    
}
class Horse implements Animal,Cattle{
    public void walk(){
        System.out.println("It can walk");
    }
}
public class Interface {
    public static void main(String[] args){
        Horse h=new Horse();
        h.walk();
    }
}

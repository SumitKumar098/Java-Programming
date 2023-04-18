abstract class Animal{
    abstract void eat();
    public void walks(){
        System.out.println("Walks on four legs");
    }
}
class Goat extends Animal{
    public void eat(){
        System.out.println("Eat Grass");
    }
}
class Tiger extends Animal{
    public void eat(){
        System.out.println("Eat Meat");
    }
}
public class Abstraction {
    public static void main(String[] args){
        Tiger t1=new Tiger();
        t1.eat();
        t1.walks();
    }
}

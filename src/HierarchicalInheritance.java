import Color.*;

class Shape{
    int l,b,r;
    public void area(){
        System.out.println("Display area:");
    }
}
class Triangle extends Shape{
    public void area(int l,int b){
        System.out.println(0.5*l*b);
    } 
}
class Circle extends Shape{
    public void area(int r){
        System.out.println(3.14*r*r);
    }
}
public class HierarchicalInheritance {
    public static void main(String[] args){
        Circle c=new Circle();
        c.r=4;

        Triangle t=new Triangle();
        t.l=7;
        t.b=8;
        c.area();
        t.area(t.l,t.b);
        c.area(c.r);

        Color.Red re= new Color.Red();
        re.name="MyColor";
    }
}

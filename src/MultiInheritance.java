class Shape{
    int b;
    int h;
    public void area(){
        System.out.println("Area of the shape:");
    }
}
class Triangle extends Shape{
    public void area(int b,int h){
        System.out.println(0.5*b*h);
    }
}
class EquiTriangle extends Triangle{
    public void area(int b,int h){
        System.out.println(0.5*b*h);
    }
}

public class MultiInheritance {
    public static void main(String[] args){
        EquiTriangle eq=new EquiTriangle();
        // eq.b=4;
        // eq.h=3;
        eq.area();
        eq.area(45, 89);
        eq.area(45,78);
    }   
}

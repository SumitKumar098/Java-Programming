class Pen{
    String color;
    String type;

    public void mypen(){
        System.out.println("This is my pen");

    }

    public void write(){
        System.out.println(this.color);//this functions tell which object has called color 
    }
}

public class ClassObjects {
    public static void main(String[] args){
        Pen pen1= new Pen();//pen1 is object of class pen
        pen1.color="Red";
        pen1.type="Ball Pen";

        Pen pen2=new Pen();//pen2 is object of class pen
        pen2.color="Blue";
        pen2.type="Gel";

        pen1.mypen();

        pen1.write();
        pen2.write();
    }
}

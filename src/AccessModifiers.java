class Emp{
    public String name;//any class can access ,it can also be used as a package
    protected int num;//only be accessed by the same program
    private Double num2;//only be accesssed by the same class.here only Emp class can access the num2 
                        //we can use getters and setters to access the private data outside the same class
    public Double getnum2(){
        return this.num2;
    }
    public void setnum2(Double num1){
        this.num2=num1;
    }
}
public class AccessModifiers {
    public static void main(String[] args){
        Emp e1=new Emp();
        e1.name="Sumit kumar";
        e1.num=45;
        
        System.out.println(e1.name+e1.num);

        e1.setnum2(4.5);
        System.out.println(e1.getnum2());
    }
    
}

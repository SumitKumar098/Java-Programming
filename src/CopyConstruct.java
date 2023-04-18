class Kitchen{
    String food;
    String water;
    public void print(){
        System.out.println(this.food);
        System.out.println(this.water);
    }
    Kitchen(Kitchen k2){
        this.food=k2.food;
        this.water=k2.water;
    }
    public Kitchen() {
    }
    public void kitchen(){
        
    }
}
public class CopyConstruct {
    public static void main(String[] args)
    {
        Kitchen k1=new Kitchen();
        k1.food="Tomato";
        k1.water="Mineral Water";

        Kitchen k2=new Kitchen(k1);
        k2.print();
    }
}

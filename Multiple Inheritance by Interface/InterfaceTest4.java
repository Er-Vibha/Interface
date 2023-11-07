interface Car{
    public void car();
}
interface Bike{
    public void bike();
}
public class InterfaceTest4 implements Car, Bike{
    public void car() {System.out.println("This is car");}
    public void bike() {System.out.println("This is bike");}

    public static void main(String[] args) {
        InterfaceTest4 obj=new InterfaceTest4();
        obj.bike();
        obj.car();
    }
}
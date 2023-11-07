interface Car{
    public void car();
}
interface Bike extends Car{
    public void bike();
}
public class InterfaceTest3 implements Bike{
    public void bike() { System.out.println("This is bike");}
    public void car() {System.out.println("This is car");}
    public static void main(String[] args) {
        InterfaceTest3 obj=new InterfaceTest3();
        obj.bike();
        obj.car();
    }
}


//Default method in interface
interface Draw{
    void draw();
    default void msg(){
        System.out.println("default");
    }
}
class rect implements Draw{
   public void draw(){
       System.out.println("Draw");
   }
}
public class InterfaceTest {
    public static void main(String[] args) {
        Draw obj=new rect();
        obj.draw();
        obj.msg();
    }
}

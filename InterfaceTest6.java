//Static Method in Interface
interface Testing{
    void draw();
    static int tester(int x){
      int y=x*x*x;
      return y;
    }
}
class Best implements Testing{
    public void draw(){System.out.println("Best");}
}
public class InterfaceTest6 {
    public static void main(String[] args) {
        Testing obj=new Best();
        obj.draw();
        System.out.println(Testing.tester(10));
    }
}

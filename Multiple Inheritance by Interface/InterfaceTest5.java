interface Light{
   void show();
}
interface Lime{
    void show();
}
public class InterfaceTest5  implements Light,Lime{
   public void show() {
      System.out.println("This is Show");
   }

   public static void main(String[] args) {
      InterfaceTest5 obj=new InterfaceTest5();
      obj.show();
   }
}

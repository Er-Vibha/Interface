interface test1{
   public void print();
}
public class InterfaceTest1 implements test1{
public void print(){
    System.out.println("This is Interface EXAMPLE");
}
    public static void main(String[] args) {
InterfaceTest1 obj=new InterfaceTest1();
obj.print();
    }
}

interface Parent{
    void love();
}
class Child implements Parent{
    public void love(){
        System.out.println("hello");
    }
}
class Child1 extends Child{
    public void love() {
        System.out.println("That");
    }
}
class InterfaceTest2{
    public static void main(String[] args) {
        Child ob= new Child1();
        ob.love();
    }}
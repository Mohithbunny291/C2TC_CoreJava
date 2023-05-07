class A{
      @SuppressWarnings("unused")
	private void printName(){
            System.out.println("Value-A");
      }
}
class B extends A{
      public void printName(){
            System.out.println("Name-B");
      }
}
public class Demo{
      public static void main (String[] args){
            B b = new B();
            b.printName();
      }
}
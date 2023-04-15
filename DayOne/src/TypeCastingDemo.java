
public class TypeCastingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int myInt = 9;
	    double myDouble = myInt; // Automatic casting: int to double

	    System.out.println(myInt); 
	    System.out.println(myDouble);
	    
	    double myDouble1 = 9.78d;
	    int myInt1 = (int) myDouble1; // Manual casting: double to int

	    System.out.println(myDouble1);
	    System.out.println(myInt1);
	}

}

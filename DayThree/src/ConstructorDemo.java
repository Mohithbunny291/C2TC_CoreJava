
public class ConstructorDemo {
	
	 int id;  
	    String name;  
	    //creating a parameterized constructor  
	    ConstructorDemo(int i,String n){  
	    id = i;  
	    name = n;  
	    }
	    void display(){
	    	System.out.println(id+" "+name);
	    	}  

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorDemo c1 = new ConstructorDemo(111,"Karan");  
		ConstructorDemo c2 = new ConstructorDemo(222,"Aryan");  
	    //calling method to display the values of object  
	    c1.display();  
	    c2.display();  
	}

}

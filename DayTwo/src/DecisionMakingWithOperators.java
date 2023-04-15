import java.util.*;
public class DecisionMakingWithOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, c, largest, temp;  
		Scanner scan = new Scanner(System.in);  
		
		System.out.println("Enter the first number:");  
		a = scan.nextInt();  
		
		System.out.println("Enter the second number:");  
		b = scan.nextInt();  
		
		System.out.println("Enter the third number:");  
		c = scan.nextInt();  
		
		temp=a>b?a:b;  
		
		largest=c>temp?c:temp;   
		
		System.out.println("The largest number is: "+largest);  
	}

}

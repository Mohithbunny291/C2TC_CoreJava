import java.util.Scanner;
public class NestedIfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a,b,c;
		Scanner scan = new Scanner(System.in);
		
		a = scan.nextInt();
		b = scan.nextInt();
		c = scan.nextInt();

        if(a >= b) {
            if(a >= c)
                System.out.println(a + " is the largest number.");
            else
                System.out.println(c + " is the largest number.");
        } else {
            if(b >= c)
                System.out.println(b + " is the largest number.");
            else
                System.out.println(c + " is the largest number.");
        }
	}

}

import java.util.Scanner;
public class IfElseDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int i = scan.nextInt();
		 
        if(i < 15) {
            System.out.println("10 is less than 15");
        }else {
		System.out.println("Else Statement");
        }
	}
}

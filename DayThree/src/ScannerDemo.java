import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Name");
		String name = scan.next();
		System.out.println("Enter Age");
		int age = scan.nextInt();
		System.out.println("Enter Income");
		int income = scan.nextInt();
		System.out.println("Enter Gender");
		String gender = scan.next();
		
		Person p1 = new Person();
		p1.setName(name);
		p1.setAge(age);
		p1.setIncome(income);
		p1.setGender(gender);
		
		//System.out.println(p1);
		
		TaxCalculation cal = new TaxCalculation();
		cal.calculateTax(p1);
		System.out.println(p1);
	}

}

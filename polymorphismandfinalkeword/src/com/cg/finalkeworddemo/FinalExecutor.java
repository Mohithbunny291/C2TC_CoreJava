package com.cg.finalkeworddemo;
public class FinalExecutor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//final int i = 10;
		FinalVariableExample f = new FinalVariableExample();
		f.print("Mohith");
		
		FinalChildMethod c = new FinalChildMethod();
		System.out.println(c.print());
		System.out.println(c.print(23));
		
		ChildClassTest c1 = new ChildClassTest();
		c1.display(23);
		c1.display();
	}	

}

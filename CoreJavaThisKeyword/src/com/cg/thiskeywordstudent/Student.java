package com.cg.thiskeywordstudent;

class Test{  
	int rollno = 32311;  
	String name = "Mohith";  
	float fee = 13131.1f; 
	
	public Test() {
		
		
		System.out.println(rollno+" "+name+" "+fee);
	}
	
	Test(int rollno,String name,float fee){  
		this.rollno=rollno;  
		this.name=name;  
		this.fee=fee;
		
		
		System.out.println(rollno+" "+name+" "+fee);
	} 
	
//	void display(){
//		System.out.println(rollno+" "+name+" "+fee);
//	}  
}  
  
class Student{  
	@SuppressWarnings("unused")
	public static void main(String args[]){  
		Test s1=new Test(111,"ankit",5000f);  
		Test T1 = new Test();
		Test s2=new Test(112,"sumit",6000f);  
//		T1.display();
//		s1.display();  
//		s2.display();  
}}  
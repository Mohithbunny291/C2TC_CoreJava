package com.cg.completecollections;

class Container1<T>{
	T generic;
}


class Container<Integer, String, Double extends Number>{
	String value;
	Integer int1; 
	Double dob1;
	public Container() {
		String value = (String) "Rohith";
		int int1 = 81;
		double dob1 = 1122.312342;
		
	}
	public Container(String value, int int1, Double dob1) {
		this();
	}
	public void show() {
		System.out.println(value.getClass().getName());
	}
	public String getValue() {
		return value;
	}
//	public void setValue(String value) {
//		this.value = value;
//	}
	public Integer getInt1() {
		return int1;
	}
//	public void setInt1(Integer int1) {
//		this.int1 = int1;
//	}
	public Double getDob1() {
		return dob1;
	}
//	public void setDob1(Double dob1) {
//		this.dob1 = dob1;
//	}
}


public class UserGeneric {

	public static void main(String[] args) {
		Container1<Student> s = new Container1();
		Container<Integer, String, Double> c= new Container<>();
		//Integer i = new Integer(100);
		new Container();
		c.value = "Mohith";
		c.dob1 = 91.2;
		c.int1 = 20;
		System.out.println(c.getValue());
		System.out.println(c.getDob1());
		System.out.println(c.int1);
		c.show();
	}

}

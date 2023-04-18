package com.cg.singleinheritance;

public class Student extends Citizen{
	private int rollno;
	private String CollageName;
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Student(int rollno, String collageName) {
		super();
		this.rollno = rollno;
		CollageName = collageName;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getCollageName() {
		return CollageName;
	}

	public void setCollageName(String collageName) {
		CollageName = collageName;
	}

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", CollageName=" + CollageName + ", getRollno()=" + getRollno()
				+ ", getCollageName()=" + getCollageName() + ", getName()=" + getName() + ", getAadharno()="
				+ getAadharno() + ", getAddress()=" + getAddress() + ", getPhoneno()=" + getPhoneno() + ", getClass()="
				+ getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
	
	
}

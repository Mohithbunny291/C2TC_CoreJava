package com.cg.multilevelinheritance;


class Animal{
	void eat() {
		System.out.println("Eating");
	}
}
class Dog extends Animal{
	void bark() {
		System.out.println("Barking");
	}
}
class puppy extends Dog{
	void weep() {
		System.out.println("Weeping");
	}
}

public class MultiLevelInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		puppy p = new puppy();
		p.eat();
		p.bark();
		p.weep();
	}

}

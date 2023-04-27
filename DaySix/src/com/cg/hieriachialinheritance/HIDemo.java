package com.cg.hieriachialinheritance;



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
class Cat extends Animal{
	void meow() {
		System.out.println("Meowing...");
	}
}

public class HIDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d = new Dog();
		d.bark();
		d.eat();
		
		Cat c = new Cat();
		c.meow();
		c.eat();
	}

}

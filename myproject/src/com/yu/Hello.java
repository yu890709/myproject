package com.yu;

public class Hello {

	public static void main(String[] args) {
		float weight = 65.5f;
		float height = 1.7f;
		Person p = new Person(weight, height);
		// p.height=1.7f;
		// p.weight=65.5f;
		System.out.println(p.bmi());
		p.hello();
	}

}

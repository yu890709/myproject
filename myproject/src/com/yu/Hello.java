package com.yu;

import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
/*		Person p = new Person(65.5f, 1.7f);
		// p.height=1.7f;
		// p.weight=65.5f;
		System.out.println(p.bmi());
		p.hello();
*/			
		
		Scanner in=new Scanner(System.in);
		String studentName = in.next();
		int english =in.nextInt();
		int math = in.nextInt();
		Person transcript = new Person(studentName,english,math);
		transcript.print();
	}

}

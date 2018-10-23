package com.yu;

import java.util.Scanner;

public class Person {	
	String studentName;
	int english;
	int math;
	
	public Person(String studentName,int english,int math){
		this.studentName=studentName;
		this.english=english;
		this.math=math;
	}
	
	public float average(){
		float average =(float) (english+math)/2;
		return average;
	}
	
	public void print(){
		System.out.print("學生姓名\t英文成績\t數學成績\t平均\n"+studentName+"\t"+english+"\t"+math+"\t"+average()+"\n");
	}

	
	
	
/*	float height;
	float weight;

	public Person(float weight, float height) {
		this.weight = weight;
		this.height = height;
	}

	public float bmi() {
		float bmi = weight / (height * height);
		return bmi;
	}

	public void hello() {
		System.out.println("Hello");
	}
*/
}

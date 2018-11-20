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
	
	public float getAverage(){
		float average =(float) (english+math)/2;
		return average;
	}
	
	public String pOrf(){
		if(getAverage()<60){
			return "F";
		}else
			return "P";
	}
	
	public int getMax(){
		int max;
		return max=english>math?english:math;
	}
	
	public char getLevel(){
		int average=(int)getAverage();
		switch(average/10){
		case 10:
		case 9:
			return 'A';
		case 8:
			return 'B';
		case 7:
			return 'C';
		case 6:
			return 'D';
		default:
			return 'F';
		}
	}
	
	public void print(){
		System.out.print("學生姓名\t英文成績\t數學成績\t最高分\t平均\t等級\t及格?\n"
						+studentName+"\t"+english+"\t"+math+"\t"+getMax()+"\t"+getAverage()+"\t"+getLevel()+"\t"+pOrf());
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

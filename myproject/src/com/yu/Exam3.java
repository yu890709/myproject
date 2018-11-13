package com.yu;

import java.util.Random;
import java.util.Scanner;

public class Exam3 {

	public static void main(String[] args) {
		Random rad=new Random();
		
		int max=10;
		int min=1;
		int number=rad.nextInt(max-min+1)+1;
		System.out.println("ans="+number);
		Number r=new Number(number);
		r.guess();

	}

}

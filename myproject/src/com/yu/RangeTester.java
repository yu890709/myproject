package com.yu;

import java.util.Scanner;

public class RangeTester {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("輸入一整數:");
		boolean b;
		int num=in.nextInt();
		if(num<=5&&num>=-3){
			b=true;
		}
		else{
			b=false;
		}
		System.out.println(b);
		
	}

}

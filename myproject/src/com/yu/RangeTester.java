package com.yu;

import java.util.Scanner;

public class RangeTester {

	public static void main(String[] args) {
		Scanner in=new Scanner(System.in);
		System.out.print("輸入一整數:");
		int num=in.nextInt();
		boolean b=num<=5&&num>=-3;
		System.out.println(b);

	}

}

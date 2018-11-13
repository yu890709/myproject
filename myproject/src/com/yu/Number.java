package com.yu;

import java.util.Scanner;

public class Number {
	int random;
	int num;
	int n;
	
	public Number(int random){
		this.random=random;
	}
	
	public void guess(){
		int n=0;			//猜的數
		int num=0;			//猜的次數
		while(n!=random){
			num++;
			Scanner in=new Scanner(System.in);
			System.out.print("Your guess: ");
			n=in.nextInt();
			if(n==random){
				if(num<=2){
					System.out.println("Excellent! The secret number is "+n);
				}
				else{
					System.out.println("Great! The secret number is "+n);
				}
				break;
			}
			if(n>random){
				System.out.println("lower");
			}
			else{
				System.out.println("higher");
			}
		}
	}
}

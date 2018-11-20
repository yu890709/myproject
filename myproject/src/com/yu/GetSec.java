package com.yu;

import java.util.Random;
import java.util.Scanner;

public class GetSec {

	public static void main(String[] args) {
		Random rnd=new Random();
		Scanner in=new Scanner(System.in);
		int secret=rnd.nextInt(10)+1;
		System.out.println(secret);
		int guess=0;
		int upper=4;
		int i;
		for(i=1;i<=upper;i++){
			System.out.print("Your guess("+i+"/4):");
			guess=in.nextInt();
			if(guess==secret){
				if(i<=2){
					System.out.println("Excellent!");
				}else
					System.out.println("Great");
				break;
			}
			if(i<upper){
				if(guess>secret){
					System.out.println("Lower");
				}else{
					System.out.println("High");
				}
			}
		}
		if(i>upper)
			System.out.println("fool");
	}

}

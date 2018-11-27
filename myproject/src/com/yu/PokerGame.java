package com.yu;

import java.util.Random;

public class PokerGame {

	public static void main(String[] args) {
		Random ran=new Random();
		int cF=ran.nextInt(4);
		int cN=ran.nextInt(13)+1;
		String [] f=new String[]{"S","H","D","C"};
		System.out.println(cN+""+f[cF]);
		
		
		/*
		int cF=ran.nextInt(4);
		int cN=ran.nextInt(13)+1;
		String f="";
		switch(cF){
		case 0:
			f="S";
			break;
		case 1:
			f="H";
			break;
		case 2:
			f="D";
			break;
		case 3:
			f="C";
			break;
		}
		System.out.println(cN+""+f);
		*/
		
	}

}

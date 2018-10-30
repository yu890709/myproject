package com.yu;

import java.util.Scanner;

public class TempChange {
	double celsius;
	double fahrenheit;
	double kelvin;
	int choose;
		
	public TempChange(int choose){
		this.choose=choose;
	}
	public void input(){
		Scanner in=new Scanner(System.in);
		switch(choose){
		case 1:
			System.out.print("¿é¤JÄá¤ó·Å«×: ");
			celsius=in.nextDouble();
			break;
		case 2:
			System.out.print("¿é¤JµØ¤ó·Å«×: ");
			fahrenheit=in.nextDouble();
			break;
		case 3:
			System.out.print("¿é¤J³Í¤ó·Å«×: ");
			kelvin=in.nextDouble();
			break;
		}
	}
	public double cel(){
		double cel = 0;
		switch(choose){
		case 1:
			cel=celsius;
			break;
		case 2:
			cel=(fahrenheit-32)*5.0/9;
			break;
		case 3:
			cel=kelvin-273.15;
			break;
		}
		return cel;
	}
	public double fah(){
		double fah = 0;
		switch(choose){
		case 1:
			fah=celsius*9/5+32;
			break;
		case 2:
			fah=fahrenheit;
			break;
		case 3:
			fah=kelvin*9/5-459.67;
			break;
		}
		return fah;
	}
	public double kel(){
		double kel = 0;
		switch(choose){
		case 1:
			kel=celsius+273.15;
			break;
		case 2:
			kel=(fahrenheit+459.67)*5.0/9;
			break;
		case 3:
			kel=kelvin;
			break;
		}
		return kel;
	}
}

